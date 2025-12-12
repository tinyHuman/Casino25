package net.ictcampus.semodul;

public class Casino {
    public static void main(String[] args) {
        System.out.println("Einfache Casino Simulation");

        Person raphael = new Person();
        raphael.setName("Meer");
        raphael.setPrename("Raphael");
        raphael.setBirthyear(1995);

        Person mario = new Person();
        mario.setName("Mund");
        mario.setPrename("Mario");
        mario.setBirthyear(1980);
        mario.earnMoney(50);

        Person dani = new Person();
        dani.setName("Mug");
        dani.setPrename("Dani");
        dani.setBirthyear(2005);

        Game g1 = new Game();
        g1.setName("Zufallszahl");

        DealTable dt = new DealTable();
        dt.setActivity(g1);
        dt.setPlayer(mario);
        dt.setCroupier(raphael);
        dt.showInfos();

        for(int i = 0; i < 3; i++) {
            dt.play();
        }
        System.out.println(mario.getPrename() + " hat noch " + mario.getCredit() + " Credits");


    }
}

