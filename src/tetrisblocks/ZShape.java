package tetrisblocks;

import tetris.TetrisBlock;

public class ZShape extends TetrisBlock {
    public ZShape() {
        
        super(new int[][] {
            {1 , 1 , 0},
            {0 , 1 , 1}
        });
    }
    @Override
    public void rotate()
    {
        super.rotate();
        if(getWidth() == 2)
        {
            this.setX(this.getX() + 1);
            this.setY(this. getY() - 1);
        }
        else
        {
            this.setX(this.getX() - 1);
            this.setY(this.getY() + 1);
        }
    }
}