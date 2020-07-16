package Pieces;

public class King extends Piece {

    public King(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

}
