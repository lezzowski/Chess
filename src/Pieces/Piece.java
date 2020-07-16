package Pieces;

public class Piece {


    private boolean whiteColor;  //0-white;1-diff.white
    private String icon;


    public Piece(boolean whiteColor){
        this.whiteColor = whiteColor;
    }

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
