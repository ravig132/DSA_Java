import java.util.Scanner;

public class shiftElementByKPositionArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of position to shift array : ");
        int k = input.nextInt();

        int[] newArr = shiftElementByKPosition(arr,k);

        for (int i : newArr) {
            System.out.print(i+" ");
        }





    }
    static int[] shiftElementByKPosition(int[] arr, int k){

        int position = k%arr.length ;
        int [] temp = new int[position];
        int last = arr.length-1;

        for (int i = 0; i < position; i++) {
            temp[i] = arr[last];
            last-- ;
        }

        for (int lastIndex = arr.length-1 ; lastIndex > position-1 ; lastIndex-- ){
            arr[lastIndex] = arr[lastIndex-position];
        }


        int tempLast = temp.length-1 ;
        for (int i = 0; i < position; i++) {
            arr[i] = temp[tempLast];
            tempLast-- ;
        }




        return  arr ;
    }

}
