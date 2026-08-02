public class cardDiamondPattern {
    public static void main (String [] args ){
        int  n = 4;

        //part 1
        //for rows
        for (int row = 1 ; row<=n; row++){
            //print spaces
            for (int col = 1; col<=n-row; col++){
                System.out.print("  ");
            }
            //print pattern
            for (int col = 1 ; col<= 2*row-1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //part 2
        for (int row = 1; row<=n-1; row++){
            for (int col = 1; col<=row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col<=2*n-2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
