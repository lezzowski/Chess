import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println(b);
            System.out.println("inserisci coordinate di partenza");
            int prevLetter=sc.nextInt();
            int prevNumber=sc.nextInt();

            System.out.println("inserisci coordinate di arrivo");
            int nextLetter=sc.nextInt();
            int nextNumber=sc.nextInt();
            b.setPiece(prevLetter,prevNumber,nextLetter,nextNumber);


        }

    }
}
