package Pieces;

public class King extends Piece {

    private boolean firstMove = true;

    public King(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265A" : "\u2654");
    }

    @Override
    public boolean CheckForMove(int xFromMove, int yFromMove, int xToMove, int yToMove) {
        if ((xToMove == xFromMove - 1) || (xToMove == xFromMove + 1)){
            if ((yToMove == yFromMove -1) || (yToMove == yFromMove + 1)){
                firstMove = false;
                return true;
            }
        }
        if (xToMove == xFromMove){
            firstMove = false;
            return yToMove == yFromMove + 1 || yToMove == yFromMove - 1;
        }else if (yToMove == yFromMove){
            firstMove = false;
            return xToMove == xFromMove + 1 || xToMove == xFromMove - 1;
        }

        return false;
    }


}
