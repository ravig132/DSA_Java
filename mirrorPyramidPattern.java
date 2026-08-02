public class mirrorPyramidPattern {
    public static void main (String [] args ){
        int n = 5 ;

        for (int row = 1 ; row <= n; row++ ){

            // print spaces
            for (int col = 1 ; col<=row-1; col++){
                System.out.print("  ");
            }
            // will print inverted pyramid
            for (int col = 1 ; col <= 2*n-2*row+1; col++){
                System.out.print("* ");
            }
            //move to next line
            System.out.println();

        }

        for (int row = 1 ; row <= n ; row++){

            if(row==1){
                continue;
            }
//            print spaces
            for (int col=1 ; col<= n-row; col++){
                System.out.print("  ");
            }

//            print stars
            for (int col = 1; col<=2*row-1; col++){
                System.out.print("* ");
            }
//            print next line
            System.out.println();
        }

    }
}
