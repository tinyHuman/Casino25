package net.ictcampus.semodul;

import java.util.Scanner;

public class Person {
    private String name;
    private String prename;
    private int birthyear;
    private int credit;

    public void sayName() {
        System.out.println(prename + " " + name);
    }

    public void earnMoney(int amount) {
        credit += amount;
    }

    public int putAtStake() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deinen Einsatz ein: ");
        int bet = scanner.nextInt();
        if(bet <= credit){
            credit -= bet;
            return bet;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getCredit() {
        return credit;
    }
}
