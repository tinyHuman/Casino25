package net.ictcampus.semodul;

public class Casino {
    public static void main(String[] args) {
        System.out.println("Einfache Casino Simulation");

        Person raphael = new Person();
        raphael.name = "Meer";
        raphael.prename = "Raphael";
        raphael.birthyear = 1995;

        Person mario = new Person();
        mario.name = "Mund";
        mario.prename = "Mario";
        mario.birthyear = 1980;

        Person dani = new Person();
        dani.name = "Mug";
        dani.prename = "Dani";
        dani.birthyear = 2005;

        Game g1 = new Game();
        g1.name = "Zufallszahl";

        DealTable dt = new DealTable();
        dt.activity = g1;
        dt.player = mario;
        dt.croupier = raphael;

        dt.showInfos();
    }
}

