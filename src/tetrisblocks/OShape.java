package tetrisblocks;

import tetris.TetrisBlock;

public class JShape extends TetrisBlock {
    public JShape() {
        super(new int[][] { { 0, 1 },
                {1, 1},
                {1, 1}
        });
    }
}
@Override
    public void spawn(int gridWidth) {
    super.spawn(gridWidth);
    }
}
