public class LambSkewers {
    public static void main(String[] args) {
        int n = 64;
        int k = 6;
        int lamb = 12000;
        int drink = 2000;

        int cc = 0;


        cc = drink * (k  - (n / 10));
        System.out.println(lamb*n + cc);


    }
}
