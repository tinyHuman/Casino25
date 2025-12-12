package net.ictcampus.semodul;

import java.util.ArrayList;

public class DealTable {
    private Game activity;
    private Employee croupier;
    private ArrayList<Player> players = new ArrayList<>();
    private int pot;
    private int numberOfPlayers;

    public DealTable(Employee croupier, Game activity) {
        this.croupier = croupier;
        this.activity = activity;
    }

    public void showInfos() {
        System.out.println("Das Game " + activity.getName() + " wird durch den Croupier " + croupier.getPrename() + " geführt");
        System.out.println("Es spielt: ");
        for (Person player : players) {
            System.out.println(player.getPrename());
        }
    }

    public void addPlayer(Player player) {
        if (numberOfPlayers < 10) {
            players.add(player);
            numberOfPlayers++;
        } else {
            System.out.println("Der Tisch ist bereits voll");
        }
    }

    public void play() {
        for (Player player : players) {
            pot = player.putAtStake();
            if (activity.play()) {
                player.earnMoney(activity.payWin(pot));
                pot = 0;
            }
        }
    }

    public Game getActivity() {
        return activity;
    }

    public void setActivity(Game activity) {
        this.activity = activity;
    }

    public Employee getCroupier() {
        return croupier;
    }

    public void setCroupier(Employee croupier) {
        this.croupier = croupier;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
