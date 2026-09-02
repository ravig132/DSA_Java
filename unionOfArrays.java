import java.util.HashSet;
import java.util.Set;

public class unionOfArrays {
    public static void main(String [] args ){
        int[] A = {1,2,3,4,5,6,7,8};
        int[] B = {5,6,7,8,12,9,1};


        Set<Integer> union =  printUnion(A,B);

        for (Integer i : union) {
            System.out.print(i+" ");
        }





    }
    static Set<Integer> printUnion(int[] A, int[] B){
        Set<Integer> Union = new HashSet<>();
        for (int i = 0; i < A.length ; i++) {
            Union.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {

            Union.add(B[i]);

        }

        return Union ;
    }



}
