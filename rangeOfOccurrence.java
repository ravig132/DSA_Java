import java.util.Scanner;

public class rangeOfOccurrence {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,2,2,3,4};
        System.out.print("Enter the Number whose occurrence : ");
        int n = input.nextInt();
        int[] range = calculateRange(arr,n);
        System.out.print("[");
        for (int i = 0; i < range.length; i++) {
            if (range[i]==0){
                continue;
            }else {
                System.out.print(range[i]+" ");
            }
        }
        System.out.print("]");
    }

    public static int[] calculateRange(int[] arr,int n){
        int[] outArr = new int[arr.length];
        int j = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                if (arr[i-1]!=arr[i]){
                    outArr[j] = i ;
                    j++ ;
                } else if (arr[i]!=arr[i+1]) {
                    outArr[j] = i;
                    j++ ;
                }
            }
        }
        return outArr ;
    }
}
