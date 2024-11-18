package tetrisblocks;

import tetris.TetrisBlock;

public class OShape extends TetrisBlock {
    public OShape() {
        super(new int[][] {
            { 1, 1 },
            { 1, 1 }
        });
    }

    @Override
    public void rotate() {
    }
}
