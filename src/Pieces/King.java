package Pieces;

public class King extends Piece {

    private boolean firstMove;

    public King(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

    @Override
    public void Move() {

    }

}
