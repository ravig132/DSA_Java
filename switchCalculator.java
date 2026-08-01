import java.util.Scanner ;
public class switchCalculator {
    public static  void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the operation (+,-,/,*) : ");
        String operator = input.next() ;
        System.out.print("Enter the second number :  ");
        int num2 = input.nextInt();

        System.out.print("The result of calculation is : ");
        switch (operator){
            case "+" :
                System.out.println(num1+num2);
                break;
            case "-" :
                System.out.println(num1-num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            case "*" :
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid Operation !");
        }
    }
}
