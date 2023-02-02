import java.util.Arrays;

class ArrayMul2 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        // 아래 줄부터 구현
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] *2;

        }

        // 위에 줄까지 구현
        return answer;
    }
    public static void main(String[] args){
        ArrayMultiple aa = new ArrayMultiple();

        int[] numbers1 = {5, 2, 3, 7, 5};
        // [10, 4, 6, 14, 10]이 나와야함
        System.out.println(Arrays.toString(aa.solution(numbers1)));

        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
        // [2, 4, 200, -198, 2, 4, 6]이 나와야함
        System.out.println(Arrays.toString(aa.solution(numbers2)));
    }
}
