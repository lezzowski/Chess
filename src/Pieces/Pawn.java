package Pieces;

public class Pawn extends Piece {

    private boolean firstMove;

    public Pawn(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265F" : "\u2659");
    }

    @Override
    public void Move() {

    }


}
