package Pieces;

public class Pawn extends Piece {

    private boolean firstMove=true;

    public Pawn(boolean whiteColor) {
        super(whiteColor);

        this.setIcon(whiteColor ? "\u265F" : "\u2659");
    }

    @Override
    public void Move(int xMove, int yMove) {
        try {
            if (isWhiteColor()) {
                if (firstMove) {
                    if (getX() - 2 != xMove || getX() - 1 != xMove) {
                        throw new Exception("Mossa non valida");
                    } else {
                        if (getX() - 1 != xMove) {
                            throw new Exception("Mossa non valida");
                        }
                    }
                } else {
                    if (firstMove) {
                        if (getX() + 2 != xMove || getX() + 1 != xMove) {
                            throw new Exception("Mossa non valida");
                        }
                    } else {
                        if (getX() + 1 != xMove) {
                            throw new Exception("Mossa non valida");
                        }
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}