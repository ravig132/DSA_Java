import java.util.Scanner;

public class primeNumRevised {
    public static  void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if (isPrimeOptimized(num)){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }

    }
    static boolean isPrime(int num ){

        for (int i = 2; i<num; i++){
            if (num%i==0){
                return false ;
            }
        }
        return true ;
    }

    static boolean isPrimeOptimized(int num){
        for (int i = 2; i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false ;
            }
        }
        return true ;
    }



}
