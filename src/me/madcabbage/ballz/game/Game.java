package me.madcabbage.ballz.game;

public class Game {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    private int fps;
    private long lastFpsTime;
    private boolean isRunning;
    private Level currentLevel;

    public Game() {
        isRunning = false;
        currentLevel = new Level();
    }

    public void run() {
        long lastLoopTime = System.nanoTime();
        final int TARGET_FPS = 120;
        final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;

        while(isRunning) {

            long now = System.nanoTime();
            long updateLength = now - lastLoopTime;
            lastLoopTime = now;
            double difference = updateLength / ((double)OPTIMAL_TIME);

            lastFpsTime += updateLength;
            fps++;

            if (lastFpsTime >= 1000000000) {
                System.out.println("(FPS: " +fps+ ")");
                lastFpsTime = 0;
                fps = 0;
            }

            doGameUpdates(difference);

            render();

            try {
                Thread.sleep((lastLoopTime - System.nanoTime() + OPTIMAL_TIME) / 1000000);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void render() {
        // Draw game board

        // Draw level (Bricks, Orbs, coins)
        currentLevel.draw();
        // Draw balls

    }

    private void doGameUpdates(double difference) {

    }
}
