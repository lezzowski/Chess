public class Queen extends Piece {

    public Queen(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return isValidQueenMove(xFromMove, yFromMove, xToMove, yToMove)
                && !hasObstacle(xFromMove, yFromMove, xToMove, yToMove);
    }

    //metodo da richiamare da Piece----
    private boolean isValidQueenMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return isDiagonalMove(xFromMove, yFromMove, xToMove, yToMove) || isStraightMove(xFromMove, yFromMove, xToMove, yToMove);
    }

    private boolean isDiagonalMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return ((Math.abs(xFromMove - xToMove) == Math.abs(yFromMove - yToMove)));
    }

    private boolean isStraightMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return (xFromMove == xToMove) || (yFromMove == yToMove);
    }

    private boolean hasObstacle(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        int tempX = xFromMove - xToMove;
        int tempY = yFromMove - yToMove;
        int newX = tempX != 0 ? tempX / Math.abs(tempX) : 0;
        int newY = tempY != 0 ? tempY / Math.abs(tempY) : 0;

        if (xFromMove == xToMove) {
            for (int j = yFromMove - newY; j != yToMove; j -= newY) {
                if (Board.getPiece(xToMove, j) != null) {
                    return true;
                }
            }
        }
        if (yFromMove == yToMove) {
            for (int i = xFromMove - newX; i != xToMove; i -= newX) {
                if (Board.getPiece(i, yToMove) != null) {
                    return true;
                }
            }
        } else {
            for (int i = xFromMove - newX; i != xToMove; i -= newX) {
                for (int j = yFromMove - newY; j != yToMove; j -= newY) {
                    if (Board.getPiece(i, j) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
