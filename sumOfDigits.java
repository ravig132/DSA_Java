import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
        while (num != 0){
            sum += num%10;
            num /= 10 ;
        }

        System.out.println("Sum of the digits are : "+sum);
    }
}
