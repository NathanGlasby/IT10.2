package snakegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.ActionMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public final class SnakeGame {

    private SnakeGame() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SnakeGame::createAndShowGame);
    }

    private static void createAndShowGame() {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel scoreLabel = new JLabel("Score: 0   High Score: 0", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        scoreLabel.setForeground(new Color(232, 248, 244));

        JLabel helpLabel = new JLabel(
                "Use arrow keys or WASD to move. Press P to pause, R to restart.",
                SwingConstants.CENTER
        );
        helpLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        helpLabel.setForeground(new Color(176, 214, 205));

        GamePanel gamePanel = new GamePanel(scoreLabel);

        JPanel infoPanel = new JPanel(new BorderLayout(0, 6));
        infoPanel.setBackground(new Color(15, 32, 39));
        infoPanel.add(scoreLabel, BorderLayout.NORTH);
        infoPanel.add(helpLabel, BorderLayout.SOUTH);

        frame.setLayout(new BorderLayout());
        frame.add(infoPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);

        registerGlobalControls(frame.getRootPane(), gamePanel);

        frame.pack();
        frame.setMinimumSize(new Dimension(520, 620));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void registerGlobalControls(JComponent component, GamePanel gamePanel) {
        InputMap inputMap = component.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = component.getActionMap();

        bind(inputMap, actionMap, "UP", "move-up", gamePanel::queueUp);
        bind(inputMap, actionMap, "W", "move-up-alt", gamePanel::queueUp);
        bind(inputMap, actionMap, "DOWN", "move-down", gamePanel::queueDown);
        bind(inputMap, actionMap, "S", "move-down-alt", gamePanel::queueDown);
        bind(inputMap, actionMap, "LEFT", "move-left", gamePanel::queueLeft);
        bind(inputMap, actionMap, "A", "move-left-alt", gamePanel::queueLeft);
        bind(inputMap, actionMap, "RIGHT", "move-right", gamePanel::queueRight);
        bind(inputMap, actionMap, "D", "move-right-alt", gamePanel::queueRight);
        bind(inputMap, actionMap, "P", "pause", gamePanel::togglePause);
        bind(inputMap, actionMap, "R", "restart", gamePanel::restartGame);
        bind(inputMap, actionMap, "SPACE", "space-action", gamePanel::handleSpacebar);
    }

    private static void bind(
            InputMap inputMap,
            ActionMap actionMap,
            String key,
            String actionKey,
            Runnable action
    ) {
        inputMap.put(KeyStroke.getKeyStroke(key), actionKey);
        actionMap.put(actionKey, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.run();
            }
        });
    }
}
