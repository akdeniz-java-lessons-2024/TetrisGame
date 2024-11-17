package tetris;

import javax.swing.JOptionPane;

public class Tetris {
    private static GameForm gf;
    private static StartupForm sf;

    public static void start() {
        gf.setVisible(true);
        gf.startGame();
    }

    public static void showStartup() {
        sf.setVisible(true);
    }

    public static void gameOver(int score) {
        gf.setVisible(false);
        JOptionPane.showMessageDialog(null, 
                                      "The game ended Your score is " + score, 
                                      "Game Over", 
                                      JOptionPane.WARNING_MESSAGE);

        sf.setVisible(true);
   }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                gf = new GameForm();
                sf = new StartupForm();
                sf.setVisible(true);
            }
        });
    }
}
