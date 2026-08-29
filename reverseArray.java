public class reverseArray {
    public static void main (String [] args ){
        int [] arr = {3,5,1,2,7,8,4,9};

        int[] newArr = swapArray(arr);
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }

    static int[] swapArray(int[] arr){
        int left = 0 ;
        int right = arr.length-1 ;

        while(left<right){
            int temp = 0 ;
            temp = arr [left];

            arr[left] = arr[right] ;

            arr[right] = temp ;

            left++ ;
            right-- ;
        }

        return arr ;
    }

}
