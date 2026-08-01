public class countDigit {
    public static void main (String []args){
        int num = utility.inputNum();
        System.out.printf("%d have %d digits",num,counter(num));

    }
    public static int counter(int num){
        int count = 0 ;
        if(num == 0){
            return 1 ;
        }
        while (num>0){
            if (num%10 != 0){
                count++;
            }
            num = num / 10 ;
        }
        return count ;
    }
}
