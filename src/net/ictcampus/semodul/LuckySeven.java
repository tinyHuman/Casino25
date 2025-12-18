package net.ictcampus.semodul;

import java.util.*;

public class LuckySeven extends Game {
    private int calculator = 0;
    private List<Integer> leftLine = Arrays.asList(2, 11, 10, 5, 8);
    private List<Integer> rightLine = Arrays.asList(3, 4, 6, 9, 12);


    public LuckySeven(String name) {
        super(name);
    }

    @Override
    public boolean play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(6) + 1;
        int num2 = random.nextInt(6) + 1;
        System.out.println("Setze auf eine Zahl: ");
        int guess = scanner.nextInt();

        if (guess == 7 && num1 + num2 == 7){
            calculator = 3;
            System.out.println("Gratuliere! Es war eine 7");
        } else if (guess == num1 + num2) {
            calculator = 2;
            System.out.println("Du hast die gewürfelte Zahl erraten");
        } else if ((leftLine.contains(guess) && leftLine.contains(num1 + num2)) || (rightLine.contains(guess) && rightLine.contains(num1 + num2))) {
            calculator = 1;
            System.out.println("Deine Zahl war im gleichen Bereich: " + (num1 + num2));
        } else {
            calculator = 0;
            System.out.println("Das war leider nichts... Es wurde eine " + (num1 + num2) + " gewürfelt");
        }
        return true;
    }

    @Override
    public int payWin(int pot) {
        return pot * calculator;
    }
}
