public class sortingZeroesAndOnesArray {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,1,0,0,0,1,1,0,1,1,0,1};

        int [] newArr = sortZeroesAndOnes(arr);

        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }

    static int[] sortZeroesAndOnes(int [] arr){
        int left = 0;
        int right = arr.length - 1;



        while(left<right){

            int temp = 0 ;
            if (arr[left] == 1 && arr[right] == 0){
                temp = arr[left] ;

                arr[left] = arr[right];

                arr[right] = temp ;
             }
            if (arr[left] == 0){
                left++;
            }

            if (arr[right] == 1){
                right-- ;
            }


        }
        return  arr ;
    }
}
