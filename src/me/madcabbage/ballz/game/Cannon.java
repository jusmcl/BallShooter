package me.madcabbage.ballz.game;

import me.madcabbage.ballz.game.items.Ball;

import java.util.ArrayList;
import java.util.List;

public class Cannon {

    private List<Ball> balls;

    public Cannon() {
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getShots() {
        return balls.size();
    }
}
