package net.ictcampus.semodul;

public class LuckySeven extends Game {
    private int calculator;
    private int[] leftLine = {2, 11, 10, 5, 8};
    private int[] rightLine = {3, 4, 6, 9, 12};

    public LuckySeven(String name) {
        super(name);
    }

    @Override
    public boolean play() {
        return true;
    }

    @Override
    public int payWin(int pot) {
        return 0;
    }
}
