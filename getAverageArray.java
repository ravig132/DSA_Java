public class getAverageArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,4};

        System.out.println(getAverage(arr));

    }
    static double getAverage(int [] arr){
        double sum  = 0 ;


        for (int i = 0 ; i<arr.length; i++){
            sum = sum+arr[i];
        }

        return sum /arr.length;
    }
}
