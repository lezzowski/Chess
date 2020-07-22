public class Pawn extends Piece {

    private boolean firstMove=true;

    public Pawn(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265F" : "\u2659");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) throws Exception {
        if (isWhiteColor()) {
            if (firstMove) {
                firstMove=false;
                return xToMove == (xFromMove - 2) || xToMove == (xFromMove - 1);
            } else {
                return xToMove == (xFromMove - 1);
            }
        } else {
            if (firstMove) {
                firstMove=false;
                return xToMove == (xFromMove + 2) || xToMove == (xFromMove + 1);
            } else {
                return xToMove == (xFromMove + 1);
            }
        }
    }
}