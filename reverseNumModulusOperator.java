import java.util.Scanner;

public class reverseNumModulusOperator {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.print("Reversed number is : "+reverseNum(num));

    }

    static int reverseNum(int num ){
        int reverse = 0;

        while (num>0){
            int digit = num % 10 ;
            reverse = reverse*10+digit;
            num = num / 10 ;
        }

        return reverse ;
    }
}
