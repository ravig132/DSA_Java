public class palindromePyramid {
    public static void main(String[] args) {

        int n = 5 ;

        for (int row = 1 ; row<=n; row++){
            // spaces
            for (int col = 1 ; col<=n-row; col++){
                System.out.print("  ");
            }
            // part 1 number
            for (int col = 1 ; col<=row ; col++){
                System.out.print(col+" ");
            }

            for (int col = row ; col>=1; col--){
                if (col==row){
                    continue;
                }
                System.out.print(col+" ");
            }


            System.out.println();

        }


    }
}
