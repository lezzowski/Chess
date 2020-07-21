package Pieces;

public class Knight extends Piece {

    public Knight(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {

        return false;
    }


}
