public class SumMinus {
    public static int solution(int num) { // 이거 원래대로 바꿔달라고 하쟈
        String numstr = String.valueOf(num);
        int result=0;
        int result2 =0;
        for (int i = 0; i < numstr.length(); i++) {
            char n = numstr.charAt(i);

            int nint = n - '0';

            result+= nint;

          result2 = num - result;

        }


        return result2;
    }

    public static void main(String[] args) {

        System.out.println(solution(1004));
        System.out.println(solution(2003));
        System.out.println(solution(1998));

    }
}
