public class uniqueElementArray {
    public static void main(String[] args) {

        int [] arr = {37, 12, 45, 8, 23, 37, 91, 12, 56, 8, 72, 45, 19, 23, 91, 56, 72};
        System.out.println(uniqueElement(arr));
    }

    static int uniqueElement(int [] arr){
        int xorSum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            xorSum ^= arr[i];
        }
        return xorSum ;
    }
}
