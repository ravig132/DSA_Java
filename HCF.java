import java.util.Scanner;

public class HCF {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the small number : ");
        int small = input.nextInt();
        System.out.print("Enter the big number : ");
        int big = input.nextInt();

        System.out.printf("HCF of %d, %d are : %d",small,big,hcf(small,big));

    }
    public static int hcf(int small ,int big){
        int divisor = 1 ;
        if (big<small){
            System.out.println("abbey saale bola tha na small me small or big me big daal ab lele zero");
            return 0;
        }else {
                if (big % small == 0){
                    return small ;
                }else {
                    while (small>0){
                        if (big%small==0){
                            divisor = small ;
                            break;
                        }
                        small-- ;
                    }
                }
        }
        return divisor ;
    }
}
