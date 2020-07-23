public class Rook extends Piece {

    private boolean firstMove;


    public Rook(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265C" : "\u2656");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xMove, int yMove) {

        if (isSameX(xMove, xFromMove)) {
            firstMove = false;
            return isHorizontalMove(yMove, yFromMove);
        } else if (isSameY(yMove, yFromMove)) {
            firstMove = false;
            return isVerticalMove(xMove, xFromMove);
        }
        return false;
    }

    private boolean isSameX(int xMove, int xFromMove) {
        return xMove == xFromMove;
    }

    private boolean isSameY(int yMove, int yFromMove) {
        return yMove == yFromMove;
    }

    private boolean isHorizontalMove(int yMove, int yFromMove) {
        return yMove == yFromMove + 1 || yMove == yFromMove + 2 || yMove == yFromMove + 3 ||
                yMove == yFromMove + 4 || yMove == yFromMove + 5 || yMove == yFromMove + 6 || yMove == yFromMove + 7 || yMove == yFromMove - 1 || yMove == yFromMove - 2 || yMove == yFromMove - 3 ||
                yMove == yFromMove - 4 || yMove == yFromMove - 5 || yMove == yFromMove - 6 || yMove == yFromMove - 7;

    }

    private boolean isVerticalMove(int xMove, int xFromMove) {
        return xMove == xFromMove + 1 || xMove == xFromMove + 2 || xMove == xFromMove + 3 ||
                xMove == xFromMove + 4 || xMove == xFromMove + 5 || xMove == xFromMove + 6 || xMove == xFromMove + 7 ||
                xMove == xFromMove - 1 || xMove == xFromMove - 2 || xMove == xFromMove - 3 ||
                xMove == xFromMove - 4 || xMove == xFromMove - 5 || xMove == xFromMove - 6 || xMove == xFromMove - 7;
    }
}
