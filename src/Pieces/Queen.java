package Pieces;

public class Queen extends Piece {

    public Queen(int x, int y,boolean whiteColor) {
        super(x, y,whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public void Move() {

    }
}
