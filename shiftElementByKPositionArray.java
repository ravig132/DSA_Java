import java.util.Scanner;

public class shiftElementByKPositionArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of position to shift array : ");
        int position = input.nextInt();

        int[] newArr = shiftElementByKPosition(arr,position);

        for (int i : newArr) {
            System.out.print(i+" ");
        }





    }
    static int[] shiftElementByKPosition(int[] arr, int position){
        int [] temp = new int[position];
        int last = arr.length-1;

        for (int i = 0; i < position; i++) {
            temp[i] = arr[last];
            last-- ;
        }

        for (int i=last; i > position-1 ; i--) {

            arr[i] = arr[i-3];

        }

        int tempLast = temp.length-1 ;
        for (int i = 0; i < position; i++) {
            arr[i] = temp[tempLast];
            tempLast-- ;
        }




        return  arr ;
    }

}
