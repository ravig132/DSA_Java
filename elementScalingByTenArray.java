public class elementScalingByTenArray {
    public static void main(String[] args){
        int [] arr = {2,3,5,9,12};
        int [] newArr = elementScaling(arr);

        for (int i : newArr ){
            System.out.print(i+" ");
        }

    }
    static int[] elementScaling(int[] arr){
        for (int i = 0; i<arr.length; i++){
            arr[i] = arr[i]*10;
        }
        return arr ;
    }

}
