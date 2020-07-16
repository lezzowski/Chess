package Pieces;

public class Knight extends Piece {

    public Knight(int x, int y,boolean whiteColor) {
        super(x, y,whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public void Move() {

    }
}
