public class Bishop extends Piece {

    public Bishop(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265D" : "\u2657");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return ((Math.abs(xFromMove - xToMove) == Math.abs(yFromMove - yToMove)) && !hasObstacle(xFromMove, yFromMove, xToMove, yToMove));
    }

    private boolean hasObstacle(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        int tempX = xFromMove - xToMove;
        int tempY = yFromMove - yToMove;
        int newX = tempX / Math.abs(tempX);
        int newY = tempY / Math.abs(tempY);
        for (int i = xFromMove - newX, j = yFromMove - newY; i != xToMove; i -= newX, j -= newY) {
            if (Board.getPiece(i, j) != null) {
                return true;
            }
        }
        return false;
    }


}
