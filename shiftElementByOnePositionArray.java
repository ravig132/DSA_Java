public class shiftElementByOnePositionArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80};

        int [] newArr = shiftElementByOnePosition(arr) ;

        for (int i : newArr) {
            System.out.print(i+" ");
        }

    }
    static int[] shiftElementByOnePosition(int [] arr){
        int temp = arr[arr.length-1];

        for (int i = arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp ;
        return arr ;
    }

}
