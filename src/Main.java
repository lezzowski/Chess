import Pieces.*;

public class Main {
    public static void main(String[] args) {

        Pawn p = new Pawn(1,1,true);
        Pawn p1 = new Pawn(1,1,false);
        System.out.println(p);
        System.out.println(p1);
        Knight k = new Knight(1,1,true);
        Knight k1 = new Knight(1,1,false);
        System.out.println(k);
        System.out.println(k1);
        Bishop b = new Bishop(1,1,true);
        Bishop b1 = new Bishop(1,1,false);
        System.out.println(b);
        System.out.println(b1);
        Rook r = new Rook(1,1,true);
        Rook r1 = new Rook(1,1,false);
        System.out.println(r);
        System.out.println(r1);
        Queen q = new Queen(1,1,true);
        Queen q1 = new Queen(1,1,false);
        System.out.println(q);
        System.out.println(q1);
        King king = new King(1,1,true);
        King king1 = new King(1,1,false);
        System.out.println(king);
        System.out.println(king1);
    }
}
