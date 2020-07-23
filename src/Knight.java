public class Knight extends Piece {

    public Knight(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return isValidKnightMove(xFromMove, yFromMove, xToMove, yToMove);
    }

    private boolean isValidKnightMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return (xToMove == xFromMove + 2) && (yToMove == yFromMove + 1) || (xToMove == xFromMove + 2) && (yToMove == yFromMove - 1)
                || (xToMove == xFromMove - 2) && (yToMove == yFromMove - 1)
                || (xToMove == xFromMove - 2) && (yToMove == yFromMove + 1)
                || (xToMove == xFromMove + 1) && (yToMove == yFromMove + 2)
                || (xToMove == xFromMove + 1) && (yToMove == yFromMove - 2)
                || (xToMove == xFromMove - 1) && (yToMove == yFromMove - 2)
                || (xToMove == xFromMove - 1) && (yToMove == yFromMove + 2);
    }

}
