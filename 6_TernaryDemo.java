public class TernaryDemo {

   
    public static void main(String[] args) {
        find_max_2_integers1(577, 61);
        find_max_2_integers2(577, 61);
        find_max_2_integers3(577, 61);
        find_max_3_integers1(57, 61, 5);
        find_max_3_integers2(57, 61, 5);
    }

    private static void find_max_2_integers1(int n1, int n2) {
        int max;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        System.out.println("Maximum = " + max);

    }

    private static void find_max_2_integers2(int n1, int n2) {

        int max = (n1 > n2) ? n1 : n2;

        System.out.println("Maximum = " + max);
    }

    private static void find_max_2_integers3(int n1, int n2) {
        System.out.println("Maximum = "+((n1 > n2) ? n1 : n2));
    }

    private static void find_max_3_integers1(int n1, int n2, int n3) {
        int max;
        if(n1 > n2){
            if(n1 > n3){
                max = n1;
            }else{
                max= n3;
            }
        }else{
            if(n2 > n3){
                max= n2;
            }else{
                max = n3;
            }
        }
        System.out.println("Maximum = "+ max);
            
    }

    private static void find_max_3_integers2(int n1, int n2, int n3) {
        int max;
        max = (n1>n2)? ((n1>n3)?n1:n3) : ((n2>n3)?n2:n3);
        System.out.println("Maximum : " + max);

    }

}
