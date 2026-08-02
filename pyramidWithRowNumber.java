public class pyramidWithRowNumber {
    public static void main(String[] args) {


        int n = 5 ;

        // outer loop for row

        for (int row = 1 ; row<=n; row++){

            // part 1 space
            for (int col = 1 ; col<= n-row ; col++){
                System.out.print("  ");
            }

            // part 2 numbers with row value

            for (int col = 1 ; col<= 2*row-1; col++){
                System.out.print(row+" ");
            }

            System.out.println();
        }

    }
}
