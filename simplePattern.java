public class simplePattern {
    public static  void main (String [] args ){
        // Rectangle Pattern
        for (int i = 1; i<=3;i++){
            for (int j = 1 ; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // solid right angled triangle

        for (int i = 1; i<=5 ; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
