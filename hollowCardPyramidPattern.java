public class hollowCardPyramidPattern {
    public static void main (String [] args ){


        // part 1 for hollow Card Pyramid
        int n = 4 ;
        // for rows
        for (int row = 1 ; row<=n; row++){
            //for columns with spaces part 1
            for (int col =1 ; col<=n-row; col++){
                System.out.print("  ");
            }
            //part 2
            if (row==1){
                //1st and last row print
                for (int col = 1; col<=2*row-1; col++){
                    System.out.print("* ");
                }
            }else {
                //star space star print
                System.out.print("* ");
                for (int col = 1 ; col<=2*row-3; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        // part 2 outer loop for rows 'and' we have to use only n-1 rows
        // 2nd method is that print a hollow pyramid and continue to next iteration
        for (int row = 1 ; row<=n; row++){
            if (row==1){
                continue;
            }

            //print space for lower pyramid
            for (int col = 1 ; col<= row-1 ; col++ ){
                System.out.print("  ");
            }

            // part 2 of lower pyramid
            if (row==n){
                System.out.println("* ");
            }else {
                System.out.print("* ");
                for (int col = 1 ; col<=2*n-2*row-1;col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
