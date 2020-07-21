package Pieces;

public class Bishop extends Piece {

    public Bishop(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265D" : "\u2657");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xMove, int yMove) {

        if ((xMove == xFromMove - 1 || xMove == xFromMove - 2 || xMove == xFromMove - 3 || xMove == xFromMove - 4 ||
                xMove == xFromMove - 5 || xMove == xFromMove - 6 || xMove == xFromMove - 7) || (xMove == xFromMove + 1 || xMove == xFromMove + 2 || xMove == xFromMove + 3 ||
                xMove == xFromMove + 4 || xMove == xFromMove + 5 || xMove == xFromMove + 6 || xMove == xFromMove + 7)) {
            if (yMove == yFromMove + 1 || yMove == yFromMove + 2 || yMove == yFromMove + 3 ||
                    yMove == yFromMove + 4 || yMove == yFromMove + 5 || yMove == yFromMove + 6 || yMove == yFromMove + 7) {
                return true;
            } else if (yMove == yFromMove - 1 || yMove == yFromMove - 2 || yMove == yFromMove - 3 ||
                    yMove == yFromMove - 4 || yMove == yFromMove - 5 || yMove == yFromMove - 6 || yMove == yFromMove - 7) {
                return true;
            }
        }
        return false;
    }


}
