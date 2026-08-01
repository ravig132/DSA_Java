public class primeNumPrint {
    public static void main (String [] args ){
        int num = utility.inputNum();
        printPrime(num);
    }
    public static void printPrime(int num ){
        int i = 2;
        while (i<=num){
            if(primeNum.isPrime(i)){
                System.out.print(i+" ");
            }
            i++;
        }

        }
    }


