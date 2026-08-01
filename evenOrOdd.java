import java.util.Scanner;

public class evenOrOdd {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        if (isEven(num)){
            System.out.printf("%d is even",num);
        }else {
            System.out.printf("%d is odd",num);
        }

    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
