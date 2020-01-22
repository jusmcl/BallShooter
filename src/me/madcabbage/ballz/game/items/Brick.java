package me.madcabbage.ballz.game.items;

public class Brick{

    private int hitsLeft;

    public Brick(int hitsToDestroy) {
        this.hitsLeft = hitsToDestroy;
    }

    public void draw() {

    }

    public void hit() {
        this.hitsLeft--;
    }

}
