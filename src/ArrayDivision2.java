import java.util.Arrays;

class ArrayDivision2 {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2 - num1 + 1];
        int n=0;
        for (int i = num1; i<= num2; i++) {

            answer[n] = numbers[i];
            n++;
        }


        return answer;
    }

    public static void main(String[]args){
        ArrayDivision2 ad = new ArrayDivision2();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 3, 5};

        int num1_1 = 0;
        int num1_2 = 3;

        int num2_1 = 1;
        int num2_2 = 2;

        // 출력 : {2, 3, 4}
        System.out.println(Arrays.toString(ad.solution(numbers1, num1_1, num1_2)));

        // 출력 : {3, 5}
        System.out.println(Arrays.toString(ad.solution(numbers2, num2_1, num2_2)));
    }
}