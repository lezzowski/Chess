public class King extends Piece {

    private boolean firstMove = true;

    public King(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if (Math.abs(yToMove - yFromMove) < 2 && Math.abs(xToMove - xFromMove) < 2) {
            firstMove = false;
            return true;
        }
        return false;
    }

}
