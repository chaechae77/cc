import java.util.Arrays;

public class MakeArray2D {

        public int[][] solution(int[] num_list, int n) {
            int row = num_list.length / n;
            int[][] answer = new int[row][n];
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[0].length; j++) {


                }

            }


            return answer;
        }

        public static void main(String[] args){
            MakeArray2D aa = new MakeArray2D();

            // 예시1
            int[] numList1 = {1, 2, 3, 4, 5, 6, 7, 8};
            int n1 = 2;

            // 예시2
            int[] numList2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
            int n2 = 3;

            // [[1, 2], [3, 4], [5, 6], [7, 8]] 출력
            System.out.println(Arrays.deepToString(aa.solution(numList1, n1)));

            // [[100, 95, 2], [4, 5, 6], [18, 33, 948]] 출력
            System.out.println(Arrays.deepToString(aa.solution(numList2, n2)));
        }
}
