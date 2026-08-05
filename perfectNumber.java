public class perfectNumber {
    public static void main(String[] args ){
        int num = utility.inputNum();

        System.out.println(isPerfectNum(num));
    }

    static boolean isPerfectNum(int num ){
        int divisorSum = 1 ;
        for (int i = 2 ; i<=Math.sqrt(num);i++){
            if (num%i==0){
                int firstFact = i ;
                int secondFact = num/i;

                divisorSum = divisorSum +firstFact+secondFact;
            }
        }

        return divisorSum == num;
    }
}
