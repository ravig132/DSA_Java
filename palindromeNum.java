import java.util.Scanner;

public class palindromeNum {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Num = input.nextInt();

        if (isPalindrome(Num)){
            System.out.printf("The Number : %d is Palindrome ",Num);
        }else {
            System.out.printf("The Number : %d is not Palindrome ",Num);
        }
    }

    public static boolean isPalindrome(int num){
        int value = num ;
        int reversedDigit = 0;
        while(num>0){
            reversedDigit = reversedDigit*10 + num%10 ;
            num = num/10;
        }
        if (value == reversedDigit){
            return true ;
        }else {
            return false ;
        }
    }
}
