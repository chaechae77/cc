class SumNum2 {
    public int solution(int n) {
        String nStr = String.valueOf(n);

        int answer = 0;



        for (int i = 0; i < nStr.length(); i++) {
           char c = nStr.charAt(i); // nStr의 i번째를 가지고 온다

            String CC = String.valueOf(c);
            int cs = Integer.parseInt(CC);
            answer += cs;
        }

        return answer;
    }

    public static void main(String[] args){
        SumNum2 sn = new SumNum2();

        // 출력 : 10
        System.out.println(sn.solution(1234));

        // 출력 : 25
        System.out.println(sn.solution(981016));
    }
}
