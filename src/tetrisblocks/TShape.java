package tetrisblocks;

import tetris.TetrisBlock;

public class TShape extends TetrisBlock {
    public TShape() {
        super(new int[][] {
            { 0, 1, 0 },
            { 1, 1, 1 }
        });
    }
}