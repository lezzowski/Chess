package Pieces;

public class Queen extends Piece {

    public Queen(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public void Move() {

    }
}
