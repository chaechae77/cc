class LambSkewers2 {
    public int solution(int n, int k) {
        int answer = 0;
        int lamb = 12000;
        int drink = 2000;
        int cut = 0;
        int cc = 0;


        /*answer = (lamb * n)+ (drink*(k-(n/10)));*/

        cc = k - (n / 10);
        cut = cc*drink;

        answer = (lamb * n) + cut;



        return answer;
    }

    public static void main(String[] args) {
        LambSkewers2 sk = new LambSkewers2();

        // 출력 : 124000
        System.out.println(sk.solution(10, 3));

        // 출력 : 768000
        System.out.println(sk.solution(64, 6));
    }
}
