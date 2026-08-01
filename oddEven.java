import java.util.Scanner;

public class oddEven {
    public static  void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num =  input.nextInt() ;

        for (int i = 0 ; i<=num ;i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
