package net.ictcampus.semodul;

public class Casino {

    public Casino() {
        System.out.println("Willkommen im ICT-Campus Casino");
        System.out.println("Wir vergleichen Personen untereinander");

        Person wanda = new Person("Maximoff", "Wanda", 1989);
        Person clint = new Person("Barton", "Clint", 1975);
        Person pietro = new Person("Maximoff", "Pietro", 1989);

        if (wanda.equals(clint)) {
            System.out.println("Wanda und Clint sind die gleiche Person");
        }
        if (pietro.equals(clint)) {
            System.out.println("Pietro und Clint sind die gleiche Person");
        }
        if (wanda.equals(pietro)) {
            System.out.println("Wanda und Pietro sind die gleiche Person");
        }
        if (wanda == pietro) {
            System.out.println("Wanda und Pietro wurden jetzt noch mit einem == verglichen");
        }
    }

    public static void main(String[] args) {
        Casino casino = new Casino();
    }
}

