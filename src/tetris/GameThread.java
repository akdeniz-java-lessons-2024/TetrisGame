package tetris;

public class GameThread extends Thread {
    private GameArea ga;
    private GameForm gf;
    private int score;
    private int level = 1;
    private int scorePerLevel = 3;

    private int pause = 1000;
    private int speedupPerLevel = 100;

    public GameThread(GameArea ga, GameForm gf) {
        this.ga = ga;
        this.gf = gf;

        gf.updateScore(score);
        gf.updateLevel(level);
    }

    GameThread(GameArea ga) {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        while (true) {
            ga.spawnBlock();

            while (ga.moveBlockDown()) {
                try {
                    Thread.sleep(pause);
                } catch (InterruptedException ex) {
                    return;
                }
            }

            if (ga.isBlockOutOfBounds()) {
                Tetris.gameOver(score);
                break;
            }

            ga.moveBlockToBackground();
            score += ga.clearLines();
            gf.updateScore(score);

            int lvl = score / scorePerLevel + 1;
            if (lvl > level) {
                level = lvl;
                gf.updateLevel(level);
                pause -= speedupPerLevel;
            }
        }
    }

    void setPause(int speed) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
