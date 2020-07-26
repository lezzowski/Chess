public class Pawn extends Piece {

    private boolean firstMove = true;

    public Pawn(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265F" : "\u2659");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) throws Exception {
        if (isWhiteColor()) {
            if (firstMove) {
                if (((xToMove == xFromMove - 2) || (xToMove == xFromMove - 1)) && (Board.getPiece(xToMove, yToMove) != null)) {
                    return false;
                }
                if (canEat(xFromMove, yFromMove, xToMove, yToMove)) {
                    return !((Board.getPiece(xToMove, yToMove)) instanceof King);
                }

                firstMove = false;
                return (xToMove == xFromMove - 2) || (xToMove == xFromMove - 1);
            } else {
                if (canEat(xFromMove, yFromMove, xToMove, yToMove)) {
                    return !((Board.getPiece(xToMove, yToMove)) instanceof King);
                }
                if ((xToMove == xFromMove - 1) && (Board.getPiece(xToMove, yToMove) != null)) {
                    return false;
                }
                return (xToMove == xFromMove - 1);
            }
        } else {
            if (firstMove) {
                if (canEat(xFromMove, yFromMove, xToMove, yToMove)) {
                    return !((Board.getPiece(xToMove, yToMove)) instanceof King);
                }
                if (((xToMove == xFromMove + 2) || (xToMove == xFromMove + 1)) && (Board.getPiece(xToMove, yToMove) != null)) {
                    return false;
                }
                firstMove = false;
                return (xToMove == xFromMove + 2) || (xToMove == xFromMove + 1);
            } else {
                if (canEat(xFromMove, yFromMove, xToMove, yToMove)) {
                    return !((Board.getPiece(xToMove, yToMove)) instanceof King);
                }
                if ((xToMove == xFromMove + 1) && (Board.getPiece(xToMove, yToMove) != null)) {
                    return false;
                }
                return (xToMove == xFromMove + 1);
            }
        }
    }

    private boolean canEat(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if (isWhiteColor()) {
            return (xToMove == xFromMove - 1) && (yToMove == yFromMove + 1) && (Board.getPiece(xToMove, yToMove) != null)
                    || ((xToMove == xFromMove - 1) && (yToMove == yFromMove - 1) && (Board.getPiece(xToMove, yToMove) != null));

        } else {
            return (xToMove == xFromMove + 1) && (yToMove == yFromMove + 1) && (Board.getPiece(xToMove, yToMove) != null)
                    || ((xToMove == xFromMove + 1) && (yToMove == yFromMove - 1) && (Board.getPiece(xToMove, yToMove) != null));
        }
    }

}