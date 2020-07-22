package Pieces;

public class Rook extends Piece {

    private boolean firstMove;


    public Rook(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265C" :"\u2656" );
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xMove, int yMove) {
        if (xMove == xFromMove) {
            firstMove = false;
            return yMove == yFromMove + 1 || yMove == yFromMove + 2 || yMove == yFromMove + 3 ||
                    yMove == yFromMove + 4 || yMove == yFromMove + 5 || yMove == yFromMove + 6 || yMove == yFromMove + 7 || yMove == yFromMove - 1 || yMove == yFromMove - 2 || yMove == yFromMove - 3 ||
                    yMove == yFromMove - 4 || yMove == yFromMove - 5 || yMove == yFromMove - 6 || yMove == yFromMove - 7;
        } else if (yMove == yFromMove) {
            firstMove = false;
            return xMove == xFromMove + 1 || xMove == xFromMove + 2 || xMove == xFromMove + 3 ||
                    xMove == xFromMove + 4 || xMove == xFromMove + 5 || xMove == xFromMove + 6 || xMove == xFromMove + 7 ||
                    xMove == xFromMove - 1 || xMove == xFromMove - 2 || xMove == xFromMove - 3 ||
                    xMove == xFromMove - 4 || xMove == xFromMove - 5 || xMove == xFromMove - 6 || xMove == xFromMove - 7;
        }
        return false;
    }
}
