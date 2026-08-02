public class hollowPyramid {
    public static void main (String [] args ){
        int n = 5 ;
        // for rows
        for (int row = 1 ; row<=n; row++){
            //for columns with spaces part 1
            for (int col =1 ; col<=n-row; col++){
                System.out.print("  ");
            }
            //part 2
            if (row==1||row==n){
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
    }
}
