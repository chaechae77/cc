import java.util.Arrays;

public class QuizOX {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
      return answer;
    }

    public static void main(String[] args) {
        QuizOX q = new QuizOX();
        String[] arr = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] arr2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(q.solution(arr)));
        System.out.println(Arrays.toString(q.solution(arr2)));
    }
}
