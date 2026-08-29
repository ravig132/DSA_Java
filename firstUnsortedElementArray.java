public class firstUnsortedElementArray {
    public static void main(String[] args) {
        int [] arr = {2,3,9,5,13,14};
        System.out.println(firstUnsortedElement(arr));
    }
    static int firstUnsortedElement(int [] arr){
        int unsortedElement = 0 ;
        for (int i = 0 ; i<arr.length-1; i++ ){
            if (arr[i]>arr[i+1]){
                unsortedElement = arr[i+1];
            }
        }

        return unsortedElement ;
    }

}
