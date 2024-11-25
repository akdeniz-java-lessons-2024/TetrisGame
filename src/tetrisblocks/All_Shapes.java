package tetrisblocks;

import tetris.TetrisBlock;

public class IShape extends TetrisBlock {
    public IShape() {
        super(new int[][] { 
    { 1, 1, 1, 1 } 
});
        super(new int[][] { { 1, 1, 1, 1 } });
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
public class JShape extends TetrisBlock {
    public JShape() {
        super(new int[][] { { 0, 1 },
                { 0, 1 },
                { 1, 1 }
        });
    }
}
public class LShape extends TetrisBlock {
    public LShape() {
        super(new int[][] { 
    { 1, 0 }, 
    { 1, 0 }, 
    { 1, 1 } 
});
        super(new int[][] {
        });
    }
}
public class OShape extends TetrisBlock {
    public OShape() {
        super(new int[][] { 
    { 1, 1 }, 
    { 1, 1 } 
});
        super(new int[][] {
        });
    }
}
public class SShape extends TetrisBlock {
    public SShape() {
        super(new int[][] { 
    { 0, 1 }, 
    { 1, 1 }, 
    { 1, 0 } 
});
        super(new int[][] {
        });
    }
}
public class TShape extends TetrisBlock {
    public TShape() {
        super(new int[][] { 
    { 1, 1, 1 }, 
    { 0, 1, 0 } 
});
        super(new int[][] {
        });
    }
}
public class ZShape extends TetrisBlock {
    public ZShape() {
        super(new int[][] { 
    { 1, 1, 0 }, 
    { 0, 1, 1 } 
});
        super(new int[][] {
        });
    }
}
