package Pieces;

public class Knight extends Piece {

    public Knight(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public boolean CheckForMove(int xfromMove, int yfromMove, int xMove, int yMove) {

        return false;
    }


}
