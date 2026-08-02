public class rightAngleTriangleAsciiValue {
    public static void main(String[] args) {


        for (char row = 'A' ; row <= 'E' ; row++){
            for (char val = 'A'; val<= row ; val++) {
                System.out.print(val+" ");

            }
            System.out.println();
        }

    }
}
