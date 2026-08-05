import java.util.Scanner;

public class armstrongNum {
    public static void main(String [] args ){
        int num = utility.inputNum();

        System.out.println(isArmstrong(num));

    }
    static boolean isArmstrong(int num){
        int Num = num ;
        int armstrong  = 0 ;
        while (Num>0){
            int digit = Num%10 ;
            armstrong += (int) Math.pow(digit,3);
            Num = Num/10;
        }
        if (armstrong==num){
            return true;
        }else {
            return false ;
        }
    }

}
