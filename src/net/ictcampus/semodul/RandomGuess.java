package net.ictcampus.semodul;

import net.ictcampus.semodul.exceptions.OutOfRangeException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomGuess extends Game {
    private int counter;

    public RandomGuess(String name) {
        super(name);
    }

    @Override
    public boolean play() {

        Random random = new Random();
        int randNum = random.nextInt(100) + 1;
        boolean guessed = false;

        while (!guessed) {
            try {
                counter++;
                int guess = 0;
                boolean inputMismatch = false;
                System.out.println("Gib eine Zahl zwischen 1 - 100 ein: ");

                while (!inputMismatch) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        guess = scanner.nextInt();
                        inputMismatch = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Bitte eine Zahl eingeben!");
                    }
                }
                if (guess > 100 || guess < 1) {
                    throw new OutOfRangeException();
                }
                else if (guess > randNum) {
                    System.out.println("Die gesuchte Zahl ist tiefer");
                } else if (guess < randNum) {
                    System.out.println("Die gesuchte Zahl ist höher");
                } else {
                    System.out.println("Gewonnen, du hast die Zahl erraten!");
                    guessed = true;
                }

            } catch (OutOfRangeException e) {
                System.out.println(e.getMessage());;
            }
        }
        return true;
    }

    @Override
    public int payWin(int pot) {
        return (5 * pot) / counter;
    }
}
