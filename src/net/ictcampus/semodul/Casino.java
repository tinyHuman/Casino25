package net.ictcampus.semodul;

import net.ictcampus.semodul.domain.PersonJDBCDao;

import java.util.ArrayList;

public class Casino {

    public Casino() {

        PersonJDBCDao personJDBCDao = new PersonJDBCDao();
        ArrayList<Player> players = (ArrayList<Player>) personJDBCDao.findAllPlayers();

        Employee wanda = new Employee("Maximoff", "Wanda", 1989);
        Game game = new RandomGuess("Zufallsraten");

        DealTable dealTable = new DealTable(wanda, game);
        dealTable.setPlayers(players);
        dealTable.getCroupier().sayWelcome();

        dealTable.play();

        for (Player player : dealTable.getPlayers()) {
            System.out.println(player.getName() + " hat noch " + player.getCredit() + " Credits zum Spielen übrig");
        }

    }

    public static void main(String[] args) {
        Casino casino = new Casino();
    }
}

