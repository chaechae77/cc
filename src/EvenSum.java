import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int num = cc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i%2 == 0){
                sum+=i;
                System.out.printf("%d", sum);// printf라고 쓰면 sum에 오류표시가 나는데 그 이유?? sout 쓰는 위치
            }
        }
    }
}
