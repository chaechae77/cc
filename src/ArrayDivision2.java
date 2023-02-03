import java.util.Arrays;

class ArrayDivision2 {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = {};
        for (int i = num1; i<= num2; i++) {




        }


        return answer;
    }

    public static void main(){
        ArrayDivision2 ad = new ArrayDivision2();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 3, 5};

        int num1_1 = 1;
        int num1_2 = 3;

        int num2_1 = 1;
        int num2_2 = 2;

        // 출력 : {2, 3, 4}
        System.out.println(Arrays.toString(ad.solution(numbers1, num1_1, num2_1)));

        // 출력 : {3, 5}
        System.out.println(Arrays.toString(ad.solution(numbers2, num1_2, num2_2)));
    }
}