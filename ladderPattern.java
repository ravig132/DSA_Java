import java.util.Scanner;

public class ladderPattern {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 1; j <=num ; j++){
                for (int l = 0; l < (num-1)*i ; l++) {
                    System.out.print("  ");
                }
                for (int k = 1 ; k<= num; k++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
}
