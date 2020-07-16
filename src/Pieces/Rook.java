package Pieces;

public class Rook extends Piece {
    public Rook(int x, int y,boolean whiteColor) {
        super(x, y,whiteColor);

        this.setIcon(whiteColor ? "\u265C" :"\u2656" );
    }

    @Override
    public void Move() {

    }
}
