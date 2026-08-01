public class primeNum {
    public static  void main (String [] args ){
        int num = utility.inputNum();
        if(isPrime(num)){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }

    }
    public static boolean isPrime(int num){
        int i = 2 ;
        while (i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true ;
    }
}
