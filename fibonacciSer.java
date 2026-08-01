public class fibonacciSer {
    public static void main (String [] args ){
        int num = utility.inputNum();
        fibonacci(num);
    }
    public static void fibonacci(int num){
        int left = 0 ;
        int right = 1 ;
        int next = 0 ;
        if (num == 1){
            System.out.print(0);
        } else{
            System.out.print(0+" "+1+" ");
        }
        for (int i = 0; i < num-2; i++) {
            next = left + right;
            left = right ;
            right = next ;
            System.out.print(next+" ");

        }
    }
}
