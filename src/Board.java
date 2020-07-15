import Pieces.*;

public class Board {


    public Piece[][] fillBoard(){
        Piece[][] pieces = new Piece[8][8];

        //Kings
        pieces[0][4] = new King(0,4,true);
        pieces[7][4] = new King(7,4,false);

        //Queens
        pieces[0][3] = new Queen(0,3,true);
        pieces[7][3] = new Queen(0,3,false);

        //Rooks
        for (int i = 0; i <= 7; i +=7){
            pieces[0][i] = new Rook(0, i, true);
            pieces[7][i] = new Rook(7, i, false);
        }

        //Knights
        for (int i = 1; i <= 6; i += 5) {
            pieces[0][i] = new Knight(0, i, true);
            pieces[7][i] = new Knight(7, i, false);
        }

        //Bishops
        for (int i = 2; i <= 5; i += 3) {
            pieces[0][i] = new Bishop(0, i, true);
            pieces[7][i] = new Bishop(7, i, false);
        }

        for (int i = 0; i < 8; i++) {
            pieces[1][i] = new Pawn(1, i, true);
            pieces[6][i] = new Pawn(6, i, false);
        }

        return pieces;
    }


}
