package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

final class GamePanel extends JPanel {

    private static final int TILE_SIZE = 20;
    private static final int GRID_WIDTH = 24;
    private static final int GRID_HEIGHT = 24;
    private static final int START_LENGTH = 3;
    private static final int STEP_DELAY_MS = 110;

    private static final Color BACKGROUND = new Color(10, 24, 29);
    private static final Color BOARD = new Color(18, 45, 55);
    private static final Color GRID = new Color(28, 63, 76);
    private static final Color SNAKE_HEAD = new Color(103, 245, 132);
    private static final Color SNAKE_BODY = new Color(57, 196, 104);
    private static final Color FOOD = new Color(255, 110, 110);
    private static final Color TEXT = new Color(232, 248, 244);

    private final Deque<Point> snake = new ArrayDeque<>();
    private final Set<Point> occupiedTiles = new HashSet<>();
    private final Random random = new Random();
    private final Timer timer;
    private final JLabel scoreLabel;

    private Direction direction = Direction.RIGHT;
    private Direction queuedDirection = Direction.RIGHT;
    private Point food;
    private boolean running;
    private boolean paused;
    private int score;
    private int highScore;

    GamePanel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
        setPreferredSize(new Dimension(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE));
        setBackground(BACKGROUND);
        setFocusable(true);

        timer = new Timer(STEP_DELAY_MS, e -> advanceGame());
        resetState();
    }

    void queueUp() {
        queueDirection(Direction.UP);
    }

    void queueDown() {
        queueDirection(Direction.DOWN);
    }

    void queueLeft() {
        queueDirection(Direction.LEFT);
    }

    void queueRight() {
        queueDirection(Direction.RIGHT);
    }

    void togglePause() {
        if (!running) {
            return;
        }
        paused = !paused;
        repaint();
    }

    void restartGame() {
        resetState();
        repaint();
    }

    void handleSpacebar() {
        if (!running) {
            if (score > 0) {
                resetState();
            }
            startGame();
            return;
        }

        togglePause();
    }

    private void queueDirection(Direction nextDirection) {
        if (!running || paused) {
            return;
        }

        if (nextDirection != direction.opposite()) {
            queuedDirection = nextDirection;
        }
    }

    private void startGame() {
        running = true;
        paused = false;
        timer.start();
    }

    private void resetState() {
        timer.stop();
        snake.clear();
        occupiedTiles.clear();

        int startX = GRID_WIDTH / 2;
        int startY = GRID_HEIGHT / 2;

        for (int i = START_LENGTH - 1; i >= 0; i--) {
            Point segment = new Point(startX - i, startY);
            snake.addLast(segment);
            occupiedTiles.add(segment);
        }

        direction = Direction.RIGHT;
        queuedDirection = Direction.RIGHT;
        running = false;
        paused = false;
        score = 0;
        spawnFood();
        updateScoreLabel();
    }

    private void advanceGame() {
        if (!running || paused) {
            return;
        }

        if (queuedDirection != direction.opposite()) {
            direction = queuedDirection;
        }

        Point currentHead = snake.peekLast();
        Point newHead = new Point(currentHead.x + direction.dx, currentHead.y + direction.dy);

        if (hitsWall(newHead)) {
            endGame();
            return;
        }

        Point currentTail = snake.peekFirst();
        boolean grows = newHead.equals(food);

        if (!grows) {
            occupiedTiles.remove(currentTail);
        }

        if (occupiedTiles.contains(newHead)) {
            endGame();
            return;
        }

        snake.addLast(newHead);
        occupiedTiles.add(newHead);

        if (grows) {
            score += 10;
            highScore = Math.max(highScore, score);
            spawnFood();
            updateScoreLabel();
        } else {
            snake.removeFirst();
        }

        repaint();
    }

    private boolean hitsWall(Point point) {
        return point.x < 0 || point.y < 0 || point.x >= GRID_WIDTH || point.y >= GRID_HEIGHT;
    }

    private void endGame() {
        running = false;
        paused = false;
        timer.stop();
        highScore = Math.max(highScore, score);
        updateScoreLabel();
        repaint();
    }

    private void spawnFood() {
        if (occupiedTiles.size() >= GRID_WIDTH * GRID_HEIGHT) {
            food = null;
            endGame();
            return;
        }

        Point candidate;
        do {
            candidate = new Point(random.nextInt(GRID_WIDTH), random.nextInt(GRID_HEIGHT));
        } while (occupiedTiles.contains(candidate));

        food = candidate;
    }

    private void updateScoreLabel() {
        scoreLabel.setText(String.format("Score: %d   High Score: %d", score, highScore));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        drawBoard(graphics);
        drawFood(graphics);
        drawSnake(graphics);

        if (!running) {
            if (score == 0) {
                drawMessage(graphics, "Press SPACE to start");
                drawSubMessage(graphics, "Eat the red food and avoid the walls and yourself.");
            } else {
                drawMessage(graphics, "Game Over");
                drawSubMessage(graphics, "Press R to restart or SPACE to play again.");
            }
        } else if (paused) {
            drawMessage(graphics, "Paused");
            drawSubMessage(graphics, "Press P or SPACE to continue.");
        }
    }

    private void drawBoard(Graphics graphics) {
        graphics.setColor(BOARD);
        graphics.fillRoundRect(0, 0, getWidth(), getHeight(), 18, 18);

        graphics.setColor(GRID);
        for (int x = 0; x <= GRID_WIDTH; x++) {
            int drawX = x * TILE_SIZE;
            graphics.drawLine(drawX, 0, drawX, GRID_HEIGHT * TILE_SIZE);
        }
        for (int y = 0; y <= GRID_HEIGHT; y++) {
            int drawY = y * TILE_SIZE;
            graphics.drawLine(0, drawY, GRID_WIDTH * TILE_SIZE, drawY);
        }
    }

    private void drawSnake(Graphics graphics) {
        Point headSegment = snake.peekLast();
        for (Point segment : snake) {
            graphics.setColor(segment.equals(headSegment) ? SNAKE_HEAD : SNAKE_BODY);
            graphics.fillRoundRect(
                    segment.x * TILE_SIZE + 2,
                    segment.y * TILE_SIZE + 2,
                    TILE_SIZE - 4,
                    TILE_SIZE - 4,
                    8,
                    8
            );
        }
    }

    private void drawFood(Graphics graphics) {
        if (food == null) {
            return;
        }

        graphics.setColor(FOOD);
        graphics.fillOval(
                food.x * TILE_SIZE + 3,
                food.y * TILE_SIZE + 3,
                TILE_SIZE - 6,
                TILE_SIZE - 6
        );
    }

    private void drawMessage(Graphics graphics, String message) {
        graphics.setColor(TEXT);
        graphics.setFont(new Font("SansSerif", Font.BOLD, 30));
        FontMetrics metrics = graphics.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(message)) / 2;
        int y = getHeight() / 2 - 10;
        graphics.drawString(message, x, y);
    }

    private void drawSubMessage(Graphics graphics, String message) {
        graphics.setColor(TEXT);
        graphics.setFont(new Font("SansSerif", Font.PLAIN, 15));
        FontMetrics metrics = graphics.getFontMetrics();
        int x = (getWidth() - metrics.stringWidth(message)) / 2;
        int y = getHeight() / 2 + 22;
        graphics.drawString(message, x, y);
    }

    private enum Direction {
        UP(0, -1),
        DOWN(0, 1),
        LEFT(-1, 0),
        RIGHT(1, 0);

        private final int dx;
        private final int dy;

        Direction(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        Direction opposite() {
            return switch (this) {
                case UP -> DOWN;
                case DOWN -> UP;
                case LEFT -> RIGHT;
                case RIGHT -> LEFT;
            };
        }
    }
}
