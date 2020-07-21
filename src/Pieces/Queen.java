package Pieces;

public class Queen extends Piece {

    public Queen(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if ((xToMove == xFromMove - 1 || xToMove == xFromMove - 2 || xToMove == xFromMove - 3 || xToMove == xFromMove - 4
                || xToMove == xFromMove - 5 || xToMove == xFromMove - 6 || xToMove == xFromMove - 7) || (xToMove == xFromMove + 1 || xToMove == xFromMove + 2 || xToMove == xFromMove + 3
                || xToMove == xFromMove + 4 || xToMove == xFromMove + 5 || xToMove == xFromMove + 6 || xToMove == xFromMove + 7)) {
            if (yToMove == yFromMove + 1 || yToMove == yFromMove + 2 || yToMove == yFromMove + 3
                    || yToMove == yFromMove + 4 || yToMove == yFromMove + 5 || yToMove == yFromMove + 6 || xToMove == xFromMove + 7) {
                return true;
            } else if (yToMove == yFromMove - 1 || yToMove == yFromMove - 2 || yToMove == yFromMove - 3
                    || yToMove == yFromMove - 4 || yToMove == yFromMove - 5 || yToMove == yFromMove - 6 || xToMove == xFromMove - 7) {
                return true;
            }
        }
        if (xToMove == xFromMove) {
            return yToMove == yFromMove + 1 || yToMove == yFromMove + 2 || yToMove == yFromMove + 3
                    || yToMove == yFromMove + 4 || yToMove == yFromMove + 5 || yToMove == yFromMove + 6 || yToMove == yFromMove + 7 || yToMove == yFromMove - 1 || yToMove == yFromMove - 2 || yToMove == yFromMove - 3
                    || yToMove == yFromMove - 4 || yToMove == yFromMove - 5 || yToMove == yFromMove - 6 || yToMove == yFromMove - 7;
        } else if (yToMove == yFromMove) {
            return xToMove == xFromMove + 1 || xToMove == xFromMove + 2 || xToMove == xFromMove + 3
                    || xToMove == xFromMove + 4 || xToMove == xFromMove + 5 || xToMove == xFromMove + 6 || xToMove == xFromMove + 7 ||
                    xToMove == xFromMove - 1 || xToMove == xFromMove - 2 || xToMove == xFromMove - 3
                    || xToMove == xFromMove - 4 || xToMove == xFromMove - 5 || xToMove == xFromMove - 6 || xToMove == xFromMove - 7;
        }
        return false;
    }


}
