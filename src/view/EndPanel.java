package view;

import controler.GameController;
import model.GameObserver;

import javax.swing.*;
import java.awt.*;

public class EndPanel extends JPanel implements GameObserver {
    public EndPanel(GameController gameController){
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(new GridLayout(0, 1));
        JLabel endLabel = new JLabel("EndPanel - VICTORY or DEFEAT");
        endLabel.setFont(new Font("Arial", Font.PLAIN, 30));

        // Centrer verticalement chaque composant dans le GridLayout
        JPanel endLabelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        endLabelPanel.add(endLabel);

        // Ajout d'un espace vertical entre les deux labels
        endLabelPanel.add(Box.createVerticalStrut(10));

        JLabel ggLabel = new JLabel("GG nom joueur");
        ggLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Centrer verticalement chaque composant dans le GridLayout
        JPanel ggLabelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ggLabelPanel.add(ggLabel);

        // Ajout panels au GridLayout
        northPanel.add(endLabelPanel);
        northPanel.add(ggLabelPanel);

        add(northPanel, BorderLayout.NORTH);

        JPanel scorePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel scoreLabel = new JLabel("SCORE : xxx");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        scorePanel.add(scoreLabel);
        scorePanel.setBorder(BorderFactory.createEmptyBorder(300, 0, 0, 0));
        add(scorePanel, BorderLayout.CENTER);

        //Mettre potentiellement les stats ici

        Button menuButton = new Button("Menu");
        Button restartButton = new Button("Restart");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(menuButton);
        buttonPanel.add(Box.createHorizontalStrut(573)); //Trouver meilleure méthode plus tard et augmenter taille boutton
        buttonPanel.add(restartButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void reactToGameStart(int roundNumber, int attemptNumber, int pawnNumber, int combinationLenght) {

    }

    @Override
    public void reactToGameEnd(int score) {

    }
}
