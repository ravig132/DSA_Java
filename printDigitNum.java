import java.util.Scanner;

public class printDigitNum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        while (num>0){
            int print = num%10;
            num = num/10 ;
            System.out.print(print+" ");
        }

    }
}
