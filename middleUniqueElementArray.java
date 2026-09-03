public class middleUniqueElementArray {

    public static void main(String[] args) {

        int[] nums = {
                1, 5, 8, 12, 17, 21, 24, 29, 31,
                36, 40, 43, 47, 52, 55, 59, 63, 67,
                71, 74, 78, 81, 85, 88, 92, 95, 99,
                103, 107, 111, 115, 119, 123, 127, 131,
                135, 139, 143, 147, 151, 155, 159, 163,
                167, 171, 175, 179, 183, 187, 191,
                195, 195, 199, 203, 207, 211, 215, 219,
                223, 227, 231, 235, 239, 243, 247, 251,
                255, 259, 263, 267, 271, 275, 279, 283,
                287, 291, 295, 299, 303, 307, 311, 315,
                319, 323, 327, 331, 335, 339, 343, 347,
                351, 355, 359, 363, 367, 371, 375, 379,
                383, 387, 391
        };

        System.out.println(isMiddleUniqueEle(nums));


    }

    static boolean isMiddleUniqueEle(int [] arr){
        int count = 0 ;
        int middleEle = arr.length/2 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arr[middleEle]){
                count++ ;
            }
        }

        if (count>1){
            return false ;
        }

        return true ;
    }

}
