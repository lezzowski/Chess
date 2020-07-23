public class Queen extends Piece {

    public Queen(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265B" : "\u2655");

    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if (isVerticalMove(xToMove,xFromMove)) {
            if (isHorizontalMove(yToMove,yFromMove)) {
                return true;
            }
        }
        if (isSameX(xToMove,xFromMove)) {
            return isHorizontalMove(yToMove,yFromMove);
        } else if (isSameY(yToMove,yFromMove)) {
            return isVerticalMove(xToMove,xFromMove);
        }
        return false;
    }

    private boolean isSameX(int xMove, int xFromMove) {
        return xMove == xFromMove;
    }

    private boolean isSameY(int yMove, int yFromMove) {
        return yMove == yFromMove;
    }

    private boolean isVerticalMove(int xMove, int xFromMove){
        return (xMove == xFromMove - 1 || xMove == xFromMove - 2 || xMove == xFromMove - 3 || xMove == xFromMove - 4 ||
                xMove == xFromMove - 5 || xMove == xFromMove - 6 || xMove == xFromMove - 7) || (xMove == xFromMove + 1 || xMove == xFromMove + 2 || xMove == xFromMove + 3 ||
                xMove == xFromMove + 4 || xMove == xFromMove + 5 || xMove == xFromMove + 6 || xMove == xFromMove + 7);
    }

    private boolean isHorizontalMove(int yMove, int yFromMove){
        return (yMove == yFromMove + 1 || yMove == yFromMove + 2 || yMove == yFromMove + 3 ||
                yMove == yFromMove + 4 || yMove == yFromMove + 5 || yMove == yFromMove + 6 || yMove == yFromMove + 7) || (yMove == yFromMove - 1 || yMove == yFromMove - 2 || yMove == yFromMove - 3 ||
                yMove == yFromMove - 4 || yMove == yFromMove - 5 || yMove == yFromMove - 6 || yMove == yFromMove - 7);
    }


}
