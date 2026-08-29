public class alternateExtremeElementArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        alternateExtremeElement(arr);
    }
    static void alternateExtremeElement(int[] arr ){

        for (int i = 0, j = arr.length-1; i < Math.ceil((double) arr.length /2) ; i++,j--) {

            if (arr[i]!=arr[j]){
                System.out.print(arr[i]+" "+arr[j]+" ");
            }else {
                System.out.print(arr[i]);
            }
        }

    }

}
