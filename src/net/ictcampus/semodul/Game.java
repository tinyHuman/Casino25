package net.ictcampus.semodul;

import java.util.Random;
import java.util.Scanner;

public abstract class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public abstract boolean play();

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
