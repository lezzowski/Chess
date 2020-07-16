package Pieces;

public class Rook extends Piece {
    public Rook(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265C" :"\u2656" );
    }
}
