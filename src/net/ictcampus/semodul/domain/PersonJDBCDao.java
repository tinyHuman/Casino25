package net.ictcampus.semodul.domain;

import net.ictcampus.semodul.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonJDBCDao implements PersonDao {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public List<Player> findAllPlayers() {
        List<Player> players = new ArrayList<>();

        String sql = "Select * from Person";
        try {
            con = openConnection();

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_person");
                Player player = new Player(rs.getString("name"), rs.getString("prename"), rs.getInt("birthyear"));
                player.earnMoney(rs.getInt("credit"));
                players.add(player);
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return players;
    }

    @Override
    public Player findPlayerByName(String name) {
        Player player = null;
        String sql = "Select * from Person where name = ?";
        try {
            con = openConnection();

            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                player = new Player(rs.getString("name"), rs.getString("prename"), rs.getInt("birthyear"));
                break;
            }
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

    private Connection openConnection() throws SQLException {
        return ConnectionFactory.getInstance().getConnection();
    }

    private void closeConnection() {
        try {

            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error in " + getClass().getName() + ": "
                    + e.getMessage());
        }
    }
}
