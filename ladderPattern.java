import java.util.Scanner;

public class ladderPattern {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        for (int i = 1; i <= (3*num) ; i++) {
            for (int j = 1; j <= i ; j++) {
                if ((i!=j)){
                    System.out.print("  ");
                }else{
                   printSquare(num);
                }

            }
            System.out.println();
        }




    }

    public static void printSquare(int num){
        for (int l = 1; l <= num ; l++) {
            for (int k = 1; k <=num ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
