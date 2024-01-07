import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class BouncingBalls extends JPanel {
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;
    private static final int BALL_RADIUS = 20;
    private static final int NUM_BALLS = 3;

    private java.util.List<Ball> balls;

    public BouncingBalls() {
        balls = new ArrayList<>();
        for (int i = 0; i < NUM_BALLS; i++) {
            balls.add(new Ball());
        }

        for (Ball ball : balls) {
            Thread ballThread = new Thread(ball);
            ballThread.start();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            ball.draw(g);
        }
    }

    private class Ball implements Runnable {
        private Color color;
        private int radius;
        private int x, y;
        private int xSpeed, ySpeed;
        private boolean collisionDetected = false;

        public Ball() {
            color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            radius = BALL_RADIUS;
            x = (int) (Math.random() * (WIDTH - 2 * radius));
            y = (int) (Math.random() * (HEIGHT - 2 * radius));
            xSpeed = (int) (Math.random() * 5 + 1);
            ySpeed = (int) (Math.random() * 5 + 1);
        }

        public void checkCollisionWithMouse() {
            if (!collisionDetected) {
                Point mousePoint = getMousePosition();
                if (mousePoint != null) {
                    double distance = Math.sqrt(Math.pow(mousePoint.x - (x + radius), 2) + Math.pow(mousePoint.y - (y + radius), 2));
                    if (distance < radius) {
                        collisionDetected = true;
                        System.out.println("Uwaga! Piłka koliduje z kursem myszy!");
                        scheduleCollisionReset();
                    }
                }
            }
        }

        private void scheduleCollisionReset() {
            ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
            scheduler.schedule(() -> {
                collisionDetected = false;
            }, 5, TimeUnit.SECONDS);
            scheduler.shutdown();
        }

        public void move() {
            x += xSpeed;
            y += ySpeed;

            if (x <= 0 || x >= WIDTH - 2 * radius) {
                xSpeed = -xSpeed;
            }

            if (y <= 0 || y >= HEIGHT - 2 * radius) {
                ySpeed = -ySpeed;
            }
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, 2 * radius, 2 * radius);
        }

        @Override
        public void run() {
            while (true) {
                move();
                checkCollisionWithMouse();
                repaint();
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
