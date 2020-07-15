package Pieces;

public class Piece {

    private int x;
    private int y;
    private boolean whiteColor;  //0-white;1-diff.white
    private String icon;


    public Piece(int x,int y,boolean whiteColor){
        this.x = x;
        this.y = y;
        this.whiteColor = whiteColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
