package net.ictcampus.semodul;

public class Casino {

    public Casino() {
        System.out.println("Willkommen im ICT-Campus Casino");

        //Initialize persons, game and dealtable
        Person tony = new Person("Stark", "Anthony", 1970);
        Person wanda = new Person("Maximoff", "Wanda", 1989);
        Person scott = new Person("Lang", "Scott", 1969);

        Game game = new Game("Zufallsraten");
        DealTable dealTable = new DealTable(wanda, game);

        //Pay credits to the players
        tony.earnMoney(50);
        scott.earnMoney(50);

        dealTable.addPlayer(tony);
        dealTable.addPlayer(scott);

        //Play the game
        for (int i = 0; i < 3; i++) {
            dealTable.play();
        }

        for (Person player : dealTable.getPlayers()) {
            System.out.println(player.getPrename() + " hat noch " + player.getCredit() + " Credits zum Spielen übrig");
        }
    }

    public static void main(String[] args) {
        Casino casino = new Casino();
    }
}

