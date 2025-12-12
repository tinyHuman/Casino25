package net.ictcampus.semodul;

import java.util.Scanner;

public class Player extends Person {
    private int credit;

    public Player(String name, String prename, int birthyear) {
        super(name, prename, birthyear);
    }

    public void earnMoney(int amount) {
        credit += amount;
    }

    public int putAtStake() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getPrename() + ", gib deinen Einsatz ein: ");
        int bet = scanner.nextInt();
        if (bet <= credit) {
            credit -= bet;
            return bet;
        } else {
            return 0;
        }
    }

    public int getCredit() {
        return credit;
    }
}
