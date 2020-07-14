package Pieces;

public class Bishop extends Piece{

    public Bishop(int x, int y, boolean whiteColor) {
        super(x, y, whiteColor);

        this.setIcon(whiteColor ? "\u265D" : "\u2657");
    }
}
