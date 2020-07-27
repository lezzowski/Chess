import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        Scanner sc = new Scanner(System.in);

        while (b.isGameInProgress()) {
            System.out.println(b);
            System.out.println("Inserisci coordinate di partenza");

            int prevX = /*insertNumber(*/sc.nextInt();
            int prevY = /*insertLetter(*/sc.nextInt();


            System.out.println("Inserisci coordinate di arrivo");

            int nextX = /*insertNumber*/sc.nextInt();
            int nextY = /*insertLetter*/sc.nextInt();
            b.play(prevX, prevY, nextX, nextY);


            if (!b.isGameInProgress()) {
                if (b.isWhite()) {
                    System.out.println("\u001B[31m" + "Il re bianco è matto" + "\u001B[0m");
                } else {
                    System.out.println("\u001B[31m" + "Il re nero è matto" + "\u001B[0m");
                }
            }

            if (b.isKingCheck()) {
                if (b.isWhite()) {
                    System.out.println("\u001B[31m" + "Il Re bianco è sotto scacco" + "\u001B[0m");
                } else {
                    System.out.println("\u001B[31m" + "Il Re nero è sotto scacco" + "\u001B[0m");
                }
            }

        }

    }
        /*public static int insertLetter(String y){
            switch (y){
                case "H":
                    return 7;
                case "G":
                    return 6;
                case "F":
                    return 5;
                case "E":
                    return 4;
                case "D":
                    return 3;
                case "C":
                    return 2;
                case "B":
                    return 1;
                case "A":
                    return 0;
            }
            return Integer.parseInt(y);
        }

    public static int insertNumber(int x){
        switch (x){
            case 1:
                return 7;
            case 2:
                return 6;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
                return 1;
            case 8:
                return 0;
        }
        return x;
    }*/
}
