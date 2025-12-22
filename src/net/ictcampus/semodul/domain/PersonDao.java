package net.ictcampus.semodul.domain;

import net.ictcampus.semodul.Player;

import java.util.List;

public interface PersonDao {
    List<Player> findAllPlayers();
    Player findPlayerByName(String name);
}
