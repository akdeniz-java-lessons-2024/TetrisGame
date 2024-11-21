package tetrisblocks;

import tetris.TetrisBlock;

public class SShape extends TetrisBlock {
    public SShape() {
        super(new int[][] {
                {0, 1, 1},
                {1, 1, 0}
        });
    }
    @Override
    public void rotate() {
        super.rotate();

        if (this.getWidth() == 1) {
            this.setX(this.getX() + 1);
            this.setY(this.getY() - 1);
        } else {
            this.setX(this.getX() - 1);
            this.setY(this.getY() + 1);
        }

    }
}
