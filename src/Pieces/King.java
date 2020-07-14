package Pieces;

public class King extends Piece {

    public King(int x, int y, boolean whiteColor) {
        super(x, y, whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

}
