package me.madcabbage.ballz.game.items;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {

    Circle circle;
    double x, y;
    double xVelocity, yVelocity;

    public Ball() {
        circle = new Circle(5, Color.WHITE);
    }

    public Ball(double xPos, double yPos) {
        this.x = xPos;
        this.y = yPos;
        this.xVelocity = 1;
        this.yVelocity = 1;

    }

    public Ball(double xPos, double yPos, double vX, double vY) {
        this.x = xPos;
        this.y = yPos;
        this.xVelocity = vX;
        this.yVelocity = vY;
    }

    public void update() {
        circle.setCenterX(this.x);
        circle.setCenterY(this.y);
    }

    public void draw() {

    }

    public double getXPos() {
        return this.x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelocityX() {
        return xVelocity;
    }

    public void setVelocityX(int velocityX) {
        this.xVelocity = velocityX;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
}
