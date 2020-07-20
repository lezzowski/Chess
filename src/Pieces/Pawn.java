package Pieces;

public class Pawn extends Piece {

    private boolean firstMove=true;

    public Pawn(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265F" : "\u2659");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xMove, int yMove) throws Exception {
        if (isWhiteColor()) {
            if (firstMove) {
                firstMove=false;
                return xMove == (xFromMove - 2) || xMove == (xFromMove - 1);
            } else {
                return xMove == (xFromMove - 1);
            }
        } else {
            if (firstMove) {
                firstMove=false;
                return xMove == (xFromMove + 2) || xMove == (xFromMove + 1);
            } else {
                return xMove == (xFromMove + 1);
            }
        }
    }
}