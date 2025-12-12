package net.ictcampus.semodul;

public class Casino {

    public Casino() {
        System.out.println("Willkommen im ICT-Campus Casino");

        Person p1 = new Person("Parker", "Peter", 2004);
        Person p2 = new Person("Banner", "Bruce", 1981);
        Person p3 = new Person("Strange", "Steven", 1972);

        Game g1 = new Game("MegaJoker");
        DealTable dt = new DealTable(p3, p1, g1);

        p1.earnMoney(100);
        dt.showInfos();
        while (dt.getPlayer().getCredit() > 0) {
            dt.play();
            System.out.println(dt.getPlayer().getPrename() + " hat noch " +
                    dt.getPlayer().getCredit() + " Credits zum Spielen übrig.");

            if (dt.getPlayer().getCredit() > 1000) {
                System.out.println(dt.getPlayer().getPrename() +
                        " ist glücklich und beendet das Spielen.");
            }
        }
        System.out.println(dt.getPlayer().getPrename() + " ist bankrott");
    }

    public static void main(String[] args) {
        Casino casino = new Casino();
    }
}

