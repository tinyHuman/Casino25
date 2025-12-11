package net.ictcampus.semodul;

public class DealTable {
    public Game activity;
    public Person croupier;
    public Person player;

    public void showInfos() {
        System.out.println("Das Game " + activity.name + " wird durch den Croupier " + croupier.prename + " geführt");
        System.out.println("Es spielt " + player.prename);
    }
}
