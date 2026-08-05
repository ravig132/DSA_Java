import java.util.Scanner;

public class palindromeNum {
   public static  void main (String [] args ){
    Scanner input = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int num = input.nextInt();

       if (isPalindrome(num)){
           System.out.printf("%d is Palindrome",num);
       }else {
           System.out.printf("%d is not Palindrome",num);
       }


   }
   static boolean isPalindrome(int num ){
       int Num = num ;
       int reverse = 0 ;

       while (Num>0){
           int digit = Num % 10 ;
           reverse = reverse*10+digit;
           Num = Num / 10 ;
       }

       if (reverse==num){
           return true ;
       }else {
           return false ;
       }
   }

}
