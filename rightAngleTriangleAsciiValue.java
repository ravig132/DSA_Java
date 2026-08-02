public class rightAngleTriangleAsciiValue {
    public static void main(String[] args) {


        for (char row = 'A' ; row <= 'E' ; row++){
            for (char val = 'A'; val<= row ; val++) {
                System.out.print(val+" ");

            }
            System.out.println();
        }

        int n = 5 ;

        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row ; col++){
                char val = (char) ('F' - col);
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
