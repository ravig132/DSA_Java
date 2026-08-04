import java.util.Scanner;

public class ladderPattern {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ladder steps : ");
        int n = input.nextInt();



        //outer loop that how many steps a ladder will have
        for (int outerLoop = 1 ; outerLoop<=n; outerLoop++  ){
            //for rows of pattern
            for (int row = 1; row<=n; row++){
                //for spaces
                for (int spaces = 1 ; spaces<=(n-1)*outerLoop+1-n; spaces++){
                    System.out.print("  ");

                }
                //for pattern columns
                for (int col = 1; col<=n; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }


        }


    }
}
