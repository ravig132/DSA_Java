import java.util.HashMap;
import java.util.Map;

public class highestAndLowestFreqArray {
    public static  void main (String[] args){
        int [] arr = {2,1,3,1,3,1,4,1,4,1,4,1};

        int[] newArr = highestAndLowestFreq(arr);
        for (int i : newArr) {
            System.out.print(i+" ");
        }



    }

    static int[] highestAndLowestFreq(int [] arr){
        Map <Integer,Integer> freq = new HashMap<>();
        int[] highestAndLowest = new int[2];
        for (int num : arr) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestFreqNum = -1 ;

        int lowestFreq = Integer.MAX_VALUE ;
        int lowestFreqNum = -1 ;

        for (Integer key : freq.keySet()) {
            int currentKey = key ;
            int currentKeyFreq = freq.get(key) ;

            if (currentKeyFreq>highestFreq){
                highestFreq = currentKeyFreq ;
                highestFreqNum = currentKey ;
            }

            if (currentKeyFreq<lowestFreq){
                lowestFreq = currentKeyFreq ;
                lowestFreqNum = currentKey ;
            }

        }

        highestAndLowest[0] = highestFreqNum ;
        highestAndLowest[1] = lowestFreqNum ;


        return highestAndLowest ;
    }


}
