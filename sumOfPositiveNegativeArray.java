public class sumOfPositiveNegativeArray {
    public static void main (String [] args){
        int [] arr = {-2,3,4,5,-4,6,-5,7,9,1,-8};

        int [] sum = sumOfPositiveAndNegative(arr);

        for (int i : sum){
            System.out.print(i+" ");
        }

    }

    static int[] sumOfPositiveAndNegative(int [] arr){
        int positive = 0 ;
        int negative = 0 ;

        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]>=0){
                positive = positive+arr[i];
            } else {
                negative = negative+arr[i];
            }
        }

        int [] sum = {positive,negative};

        return sum ;


    }

}
