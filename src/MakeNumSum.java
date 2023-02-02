public class MakeNumSum {

    public int solution(int num1, int num2) {
        int answer = 0;
        // 아래 줄부터 구현
        answer = num1 + num2;

        // 위에 줄까지 구현
        return answer;
    }

    public static void main(String[] args) {
        // solution 함수를 사용하기 위한 객체 생성
        MakeNumSum aa = new MakeNumSum();

        // 예시1
        int a1 = 2;
        int b1 = 3;

        // 예시1
        int a2 = 100;
        int b2 = 2;

        // 5 출력
        System.out.println(aa.solution(a1, b1));

        // 102 출력
        System.out.println(aa.solution(a2, b2));
    }
}