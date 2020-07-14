package Pieces;

public class Pawn extends Piece {

    private boolean firstMove;

    public Pawn(int x, int y, boolean whiteColor) {
        super(x, y, whiteColor);

        this.setIcon(whiteColor ? "\u2659" : "\u265F");
    }


}
