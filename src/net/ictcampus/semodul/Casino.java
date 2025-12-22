package net.ictcampus.semodul;

public class Casino {

    public Casino() {
        System.out.println("Willkommen im ICT-Campus Casino");

        //Initialize persons, game and dealtable
        Player tony = new Player("Stark", "Anthony", 1970);
        Employee wanda = new Employee("Maximoff", "Wanda", 1989);
        Player scott = new Player("Lang", "Scott", 1969);

        Game game1 = new RandomGuess("Zufallsraten");
        Game game2 = new LuckySeven("Lucky Seven");

        DealTable dealTable = new DealTable(wanda, game1);

        //Pay credits to the players
        tony.earnMoney(50);
        scott.earnMoney(50);

        dealTable.addPlayer(tony);
        dealTable.addPlayer(scott);

        //Play the game 3 times
        //for (int i = 0; i < 3; i++) {
            dealTable.play();
        //}

        for (Player player : dealTable.getPlayers()) {
            System.out.println(player.getPrename() + " hat noch " + player.getCredit() + " Credits zum Spielen übrig");
        }
    }

    public static void main(String[] args) {
        Casino casino = new Casino();
    }
}

