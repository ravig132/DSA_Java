public class elementSearchLinearArray {
    public static void main (String [] args ){
        int [] arr = {2,4,5,8,3,1};
        int target = 20 ;
        if (linearSearch(arr,target)){
            System.out.println("element found");
        }else {
            System.out.println("element not found");
        }

    }
    static boolean linearSearch(int [] arr , int target ){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                return true ;
            }
        }
        return false ;
    }

}
