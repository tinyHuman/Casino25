package net.ictcampus.semodul;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public boolean play() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl zwischen 1 - 10 ein: ");
        int guess = scanner.nextInt();

        if (guess > 10 || guess < 0) {
            System.out.println("Verloren...die Zahl liegt ausserhalb der Range");
            return false;
        } else if ((guess - number) < 2 && (guess - number) > -2) {
            System.out.println("Gewonnen! Die Zahl war: " + number);
            return true;
        } else {
            System.out.println("Verloren! Die Zahl war: " + number);
            return false;
        }
    }

    public int payWin(int pot) {
        return pot * 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
