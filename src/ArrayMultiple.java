import java.util.Arrays;

public class ArrayMultiple {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        // 아래 줄부터 구현
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i]*2;

        }
        // 위에 줄까지 구현
        return answer;
    }

    public static void main(String[] args){
        // solution 함수를 사용하기 위한 객체 생성
        ArrayMultiple aa = new ArrayMultiple();

        // 예시1
        int[] numbers1 = {1, 2, 3, 4, 5};

        // 예시2
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};

        // [2, 4, 6, 8, 10] 출력
        System.out.println(Arrays.toString(aa.solution(numbers1)));

        // [2, 4, 200, -198, 2, 4, 6] 출력
        System.out.println(Arrays.toString(aa.solution(numbers2)));
    }
}