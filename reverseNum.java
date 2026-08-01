import java.util.Scanner;

public class reverseNum {
    public static  void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();


        System.out.print("Reversed Number is : "+reversedNum(num));
    }
    public static int reversedNum(int Num){
        int min = (int) Math.pow(-2,31);
        int max = (int) Math.pow(2,31);

        long reversedDigit = 0 ;
        if(Num<0){
            Num = Num*-1 ;
            while (Num>0){
                reversedDigit = reversedDigit*10 +Num%10;
                Num = Num/10 ;
            }
            reversedDigit = reversedDigit*-1;
        }else {
            while (Num>0){
                reversedDigit = reversedDigit*10 + Num%10 ;;
                Num = Num/10 ;
            }
        }


        if(reversedDigit<min || reversedDigit>max){
            return 0 ;
        }


        return (int) reversedDigit;
    }

}
