package tetrisblocks;

import tetris.TetrisBlock;

public class LShape extends TetrisBlock {
    public LShape() {
        super(new int[][]{
            {0, 0, 1},
            {1, 1, 1}
        });
    }
}
