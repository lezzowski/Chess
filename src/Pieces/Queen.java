package Pieces;

public class Queen extends Piece {

    public Queen(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public boolean CheckForMove(int xfromMove, int yfromMove, int xMove, int yMove) {

        return false;
    }


}
