package net.ictcampus.semodul;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess extends Game {
    private int counter;

    public RandomGuess(String name) {
        super(name);
    }

    @Override
    public boolean play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100) + 1;
        boolean guessed = false;
        while (!guessed) {
            System.out.println("Gib eine Zahl zwischen 1 - 100 ein: ");
            int guess = scanner.nextInt();
            if (guess > randNum) {
                System.out.println("Die gesuchte Zahl ist tiefer");
            } else if (guess < randNum) {
                System.out.println("Die gesuchte Zahl ist höher");
            } else {
                System.out.println("Gewonnen, du hast die Zahl erraten!");
                guessed = true;
            }
            counter++;
        }
        return true;
    }

    @Override
    public int payWin(int pot) {
        return (5 * pot) / counter;
    }
}
