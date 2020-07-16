package Pieces;

public class Bishop extends Piece{

    public Bishop(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265D" : "\u2657");
    }
}
