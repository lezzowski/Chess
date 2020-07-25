public class Knight extends Piece {

    public Knight(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265E" : "\u2658");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        return ((Math.abs(yFromMove - yToMove) == 2 && Math.abs(xFromMove - xToMove) == 1)
                || (Math.abs(yFromMove - yToMove) == 1 && Math.abs(xFromMove - xToMove) == 2));
    }
}
