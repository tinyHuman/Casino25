package net.ictcampus.semodul;

public class DealTable {
    private Game activity;
    private Person croupier;
    private Person player;
    private int pot;

    public DealTable(Person croupier, Person player, Game activity) {
        this.croupier = croupier;
        this.player = player;
        this.activity = activity;
    }

    public void showInfos() {
        System.out.println("Das Game " + activity.getName() + " wird durch den Croupier " + croupier.getPrename() + " geführt");
        System.out.println("Es spielt " + player.getPrename());
    }

    public void play() {
        pot = player.putAtStake();
        if (activity.play()) {
            player.earnMoney(activity.payWin(pot));
        }
        pot = 0;
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

    public Person getPlayer() {
        return player;
    }

    public void setPlayer(Person player) {
        this.player = player;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }
}
