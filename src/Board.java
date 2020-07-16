import Pieces.*;


public class Board {

    Piece[][] pieces = new Piece[8][8];

    public Board(){
        fillBoard();
    }

    Piece[][] fillBoard(){

        //Kings
        pieces[0][4] = new King(0,4,false);
        pieces[7][4] = new King(7,4,true);

        //Queens
        pieces[0][3] = new Queen(0,3,false);
        pieces[7][3] = new Queen(0,3,true);

        //Rooks
        for (int i = 0; i <= 7; i +=7){
            pieces[0][i] = new Rook(0, i, false);
            pieces[7][i] = new Rook(7, i, true);
        }

        //Knights
        for (int i = 1; i <= 6; i += 5) {
            pieces[0][i] = new Knight(0, i, false);
            pieces[7][i] = new Knight(7, i, true);
        }

        //Bishops
        for (int i = 2; i <= 5; i += 3) {
            pieces[0][i] = new Bishop(0, i, false);
            pieces[7][i] = new Bishop(7, i, true);
        }

        for (int i = 0; i < 8; i++) {
            pieces[1][i] = new Pawn(1, i, false);
            pieces[6][i] = new Pawn(6, i, true);
        }

        return pieces;
    }

    @Override
    public String toString() {
        String result = "";
        int numbers = 8;
        for (int i = 0; i < 8; i++){
            result+="\n"+ numbers + " ";
            numbers--;
            for (int j= 0; j < 8; j++){
                if (this.pieces[i][j]==null){
                    result+=" ";
                }else{
                    result+=this.pieces[i][j];
                }

            }
        }
        result += " " + "\n A B C D E F G H";
        return result;
    }
}
