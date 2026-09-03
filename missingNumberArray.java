public class missingNumberArray {
    public static void main(String[] args) {

        int [] arr ={0,2,4,1,3};
        System.out.println(missingNum(arr));

    }

    static int missingNum(int [] arr){
        int xorSum = 0 ;

        for (int i = 0; i < arr.length; i++) {
            xorSum ^= arr[i];
            xorSum ^= i+1 ;
        }
        return xorSum ;
    }
}
