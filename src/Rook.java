public class Rook extends Piece {

    private boolean firstMove = true;


    public Rook(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265C" : "\u2656");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {

        if (isStraightMove(xFromMove, yFromMove, xToMove, yToMove)
                && !hasObstacle(xFromMove, yFromMove, xToMove, yToMove)) {
            firstMove = false;
            return true;
        }
        return false;
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
        }
        return false;
    }
}
