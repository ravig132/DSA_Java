public class invertedTrianglePattern {
    public static void main(String [] args ){
        int n=5;

        // outer loop will run upto to n times
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<= n+1-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
