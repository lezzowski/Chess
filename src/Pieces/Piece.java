package Pieces;

public abstract class Piece{

    private boolean whiteColor;
    private String icon;


    public Piece(boolean whiteColor){
        this.whiteColor = whiteColor;
    }

    public abstract boolean CheckForMove(int xfromMove, int yfromMove, int xMove, int yMove) throws Exception;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isWhiteColor() {
        return whiteColor;
    }

    public void setWhiteColor(boolean whiteColor) {
        this.whiteColor = whiteColor;
    }

    @Override
    public String toString() {
        return icon;
    }
}
