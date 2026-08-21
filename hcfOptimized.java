import java.util.Scanner;

public class hcfOptimized {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number : ");
        int num2 = input.nextInt();

        System.out.print(hcf(num1,num2));
    }

    static int hcf(int num1, int num2){
        while (num2!=0){
            int temp = num2 ;
            num2 = num1%num2;
            num1 = temp ;
        }
        return num1 ;
    }
}
