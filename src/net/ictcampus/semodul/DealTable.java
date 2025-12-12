package net.ictcampus.semodul;

import java.util.ArrayList;

public class DealTable {
    private Game activity;
    private Person croupier;
    private ArrayList<Person> players = new ArrayList<>();
    private int pot;
    private int numberOfPlayers;

    public DealTable(Person croupier, Game activity) {
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

    public void addPlayer(Person player) {
        if (numberOfPlayers < 10) {
            players.add(player);
            numberOfPlayers++;
        } else {
            System.out.println("Der Tisch ist bereits voll");
        }
    }

    public void play() {
        for (Person player : players) {
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

    public Person getCroupier() {
        return croupier;
    }

    public void setCroupier(Person croupier) {
        this.croupier = croupier;
    }

    public ArrayList<Person> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Person> players) {
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
