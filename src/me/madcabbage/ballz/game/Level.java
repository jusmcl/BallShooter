package me.madcabbage.ballz.game;


public class Level {

    private me.madcabbage.ballz.game.items.Brick[][] bricks;

    private int lvlNum;

    public Level() {
        lvlNum = 1;
        generateLevel(lvlNum);
    }

    public void draw() {
        //draw bricks

        //draw orbs
        //draw coins
        //draw balls
    }

    private void nextLevel() {
        lvlNum++;
    }

    private void generateLevel(int currentLevel) {
        //gen bricks, orbs, coins
    }



}
