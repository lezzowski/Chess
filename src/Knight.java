public class Knight extends Piece {

    public Knight(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {

        //Top moves
        if ((xToMove == xFromMove + 2) && (yToMove == yFromMove + 1) || (xToMove == xFromMove + 2) && (yToMove == yFromMove - 1)
                || (xToMove == xFromMove - 2) && (yToMove == yFromMove - 1)
                || (xToMove == xFromMove - 2) && (yToMove == yFromMove + 1)) {
            return true;
        }

        //Bottom moves
        return (xToMove == xFromMove + 1) && (yToMove == yFromMove + 2) || (xToMove == xFromMove + 1) && (yToMove == yFromMove - 2)
                || (xToMove == xFromMove - 1) && (yToMove == yFromMove - 2)
                || (xToMove == xFromMove - 1) && (yToMove == yFromMove + 2);
    }


}
