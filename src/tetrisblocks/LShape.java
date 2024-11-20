package tetrisblocks;

import tetris.TetrisBlock;

public class LShape extends TetrisBlock {
    public LShape() {
        
        super(new int[][] {
            {1, 1 , 1},
            {0 , 0 ,1}
        });
    }

    @Override
    public void rotate()
    {
        super.rotate();
        if(getWidth() == 1)
        {
            this.setX(this.getX() + 1);
            this.setY(this.getY() - 1);
        }
        else
        {
            this.setX(this.getX() + 1);
            this.setY(this.getY() - 1);
        }
    }
}