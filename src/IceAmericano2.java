import java.util.Arrays;
import java.util.Scanner;

public class IceAmericano2 {
    public int[] solution(int money) {

        int[] answer = new int[2];
        int iceamericano = 5500;

        int cut = money / iceamericano;
        int cc = money % iceamericano;
        answer[0] = cut;
        answer[1] = cc;


        return answer;
    }
    public static void main(String[] args) {
        IceAmericano2 aa = new IceAmericano2();
        System.out.println(Arrays.toString(aa.solution(5500)));
        System.out.println(Arrays.toString(aa.solution(15000)));
    }
}

