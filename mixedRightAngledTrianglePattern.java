public class mixedRightAngledTrianglePattern {
    public static void main(String[] args) {
        int n = 4 ;


        // part 1 of the pattern

        //outer loop for rows
        for (int row = 1 ; row<=n; row++){
            //print stars
            for (int col = 1 ; col<=row; col++){
                System.out.print("* ");
            }
//           print spaces between stars
            for (int col = 1 ; col<=2*(n-row); col++){
                System.out.print("  ");
            }
//            again print stars
            for (int col = 1 ; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // part 2 of the pattern

        for (int row = 1 ; row<=n; row++){

            // prints the stars
            for (int col = 1 ; col<=n-row+1; col++){
                System.out.print("* ");
            }

            //prints spaces between stars
            for (int col = 1 ; col<=2*row-2; col++){
                System.out.print("  ");
            }

            //print stars again
            for (int col = 1 ; col<=n-row+1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
