import java.util.Scanner;

public class LCM {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number : ");
        int num2 = input.nextInt();

        System.out.println(lcm(num1,num2));

    }

    //using formula lcm = num1*num2/hcf

    static int lcm(int num1 ,int num2){
        int hcf = hcfOptimized.hcf(num1,num2);
        return num1*num2/hcf;
    }

}
