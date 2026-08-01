public class factorialNum {
    public static void  main (String [] args ){
        int num = utility.inputNum();

        System.out.printf("Factorial of the %d is : %d",num,factorial(num));
    }
    public static int factorial(int num ){
        int fact = 1 ;
        if (num == 0 || num == 1){
            return 1 ;
        }else {
            while (num>1){
                fact = fact*num ;
                num-- ;
            }
        }
        return fact ;
    }
}
