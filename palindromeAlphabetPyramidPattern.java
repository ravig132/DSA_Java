public class palindromeAlphabetPyramidPattern {
    public static void main (String [] args ){
        int n = 5 ;

        for (int row = 1; row<=n; row++){


            //printing spaces
            for (int col = 1 ; col<=n-row; col++){
                System.out.print("  ");
            }
            char alpha = 'A';
            for (int col = 1 ; col<= row; col++){
                System.out.print(alpha+" ");
                alpha++;
            }

            char Alpha = (char) ('A'+row-2);
            for (int col = 1 ; col<=row-1; col++){
                System.out.print(Alpha+" ");
                Alpha--;
            }


            System.out.println();
        }

    }
}
