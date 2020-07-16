package Pieces;

public class Rook extends Piece {

    private boolean firstMove;


    public Rook(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265C" :"\u2656" );
    }

    @Override
    public void Move() {

    }
}
