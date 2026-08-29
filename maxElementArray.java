public class maxElementArray {
    public static void main (String[] args){
        int [] arr = {2,4,8,60,1,14};
        System.out.println(maxElement(arr));
    }
    static int maxElement(int [] arr){
        int max = 0 ;

        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }


        return max ;
    }

}
