import java.util.Scanner;

public class LCM {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the small number : ");
        int small = input.nextInt();
        System.out.print("Enter the big number : ");
        int big = input.nextInt();
        int LCM = lcm(small,big);
    }
    public static int lcm (int small, int big ){
        int i = 1 ;
        int lcmFound = 1 ;
        while (big==1){
            if (small%i==0 || big%i==0){
                lcmFound *=i ;

            }
            i++;
        }
        return 0 ;
    }
}
