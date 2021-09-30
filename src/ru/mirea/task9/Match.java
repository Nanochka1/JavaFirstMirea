package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    class Match extends JFrame {
        int x = 0;
        int y = 0;
        private JButton MILAN = new JButton("MILAN");
        private JButton MADRID = new JButton("MADRID");
        private JLabel Result = new JLabel("  Result");
        private JLabel LastScorer = new JLabel("Last Scorer: N/A");
        private Label Winner = new Label("Winner: DRAW ");

        public Match() {

            super("Match Started");
            this.setBounds(100, 200, 300, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(2, 3, 2, 2));
            add(MILAN);
            add(MADRID);
            add(Result);
            add(LastScorer);
            add(Winner);
            MILAN.addActionListener(new ButtonEventListener1());
            MADRID.addActionListener(new ButtonEventListener2());
            setVisible(true);
        }
        class ButtonEventListener1 implements ActionListener {
            public void actionPerformed(ActionEvent Event) {
                x++;
                LastScorer.setText("Last Scorer: MILAN");
                Result.setText(" Result: " + String.valueOf(x) + " X " + String.valueOf(y));
                WhoWinner(x, y);
            }
        }
        class ButtonEventListener2 implements ActionListener {
            public void actionPerformed(ActionEvent Event) {
                y++;
                LastScorer.setText("Last Scorer: MADRID");
                Result.setText("Result: " + String.valueOf(x) + " X " + String.valueOf(y));
                WhoWinner(x, y);
            }
        }

        public void WhoWinner (int x,int y)
        {
            if (x>y)
            {
                Winner.setText("Winner: MILAN");
            }
            if (x<y)
            {
                Winner.setText("Winner: MADRID");
            }
            if (x==y)
            {
                Winner.setText("Winner: DRAW");
            }
        }
    }


