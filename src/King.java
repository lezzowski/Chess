public class King extends Piece {

    private boolean firstMove;

    public King(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

    @Override
    public boolean checkForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if (isVerticalMove(xToMove, xFromMove)) {
            if (isHorizontalMove(yToMove, yFromMove)) {
                firstMove = false;
                return true;
            }
        }
        if (isSameX(xToMove,xFromMove)) {
            firstMove = false;
            return isHorizontalMove(yToMove, yFromMove);
        } else if (isSameY(yToMove,yFromMove)) {
            firstMove = false;
            return isVerticalMove(xToMove, xFromMove);
        }

        return false;
    }

    private boolean isSameX(int xToMove, int xFromMove) {
        return xToMove == xFromMove;
    }

    private boolean isSameY(int yToMove, int yFromMove) {
        return yToMove == yFromMove;
    }

    private boolean isHorizontalMove(int yToMove,int yFromMove){
        return yToMove == yFromMove + 1 || yToMove == yFromMove - 1;
    }

    private boolean isVerticalMove(int xToMove, int xFromMove){
        return xToMove == xFromMove + 1 || xToMove == xFromMove - 1;
    }

}
