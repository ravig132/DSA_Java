import java.util.HashMap;
import java.util.Map;

public class modeOfArray {
    public static void main (String [] args) {

        int [] arr = {1,2,2,3,3,4,5,5,2,2,5,5,5,51,1,1,5,6,6,6,6};


        int ans = mode(arr);

        System.out.println(ans);
    }

    static int mode(int [] arr){
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }

        int maxFreq = -1 ;
        int maxFreqKey = -1 ;

        for (Integer key : frequency.keySet()) {
            int currentKey = key ;
            int currentKeyFreq = frequency.get(key) ;
            if (currentKeyFreq>maxFreq){
                maxFreq = currentKeyFreq ;
                maxFreqKey = currentKey ;
            }

        }

        return maxFreqKey ;

    }

}
