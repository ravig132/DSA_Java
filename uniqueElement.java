public class uniqueElement {
    public static void main(String[] args) {
        int[] series = {18,13,15,14,20,13,15,14,18};

        int unique = 0 ;

        for (int i = 0; i < series.length; i++) {
            unique = series[i]^unique ;
        }

        System.out.println(unique);



    }

}
