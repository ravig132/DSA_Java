public class hollowRectanglePattern {
    public static void main(String [] args ){
        int n = 4 ;
        //outer loop

        for (int row = 1; row<=n; row++){

            //for each row 6 column
            for (int col = 1; col<=6; col++){
                if (row==1||row==n||col==1||col==6){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            //move to next line or row
            System.out.println();
        }
    }
}
