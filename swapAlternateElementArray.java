public class swapAlternateElementArray {
    public static void main (String [] args ){
        int [] arr = {1,2,3,4,5,6};

        int [] newArr = swapAlternateArray(arr) ;

        for (int i : newArr) {
            System.out.print(i+" ");
        }

    }
    static int[] swapAlternateArray(int[] arr){
        for (int i = 0 , j = i+1; i < arr.length/2; i=i+2,j=j+2) {
            int temp = 0 ;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }

        return arr ;
    }

}
