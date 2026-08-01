import java.util.Scanner ;
public class SumOfNNaturalNo {
    public static  void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to which sum you want : ");
        int num = input.nextInt();
        int i = 0 ;
        int sum = 0 ;
        while (i<=num){
            sum += i ;
            i++ ;
        }
        System.out.println("Sum of n natural numbers : "+sum);
    }
}
