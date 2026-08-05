import java.util.Scanner;

public class countDigitNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        int counter = 0;
        while (num!=0){
            int temp = num%10 ;
            counter++;
            num = num/10 ;
        }

        System.out.print("The digits in number are : "+counter);

    }

}
