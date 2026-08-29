public class countNumZeroesOnesArray {
    public static void main (String [] args ){
        int [] arr = {0,1,0,0,1,1,0,0,1,0,1,1,0,1,0};

        int [] countZeroOne = countZeroesAndOnes(arr);
        for (int i : countZeroOne) {
            System.out.print(i+" ");
        }
    }
    static int[] countZeroesAndOnes(int [] arr){
        int zero = 0 ;
        int one  = 0 ;

        for (int i : arr){
            if ((i&1)==1){
                one++;
            }else {
                zero++;
            }
        }


        int [] count = {zero,one};
        return  count;
    }
}
