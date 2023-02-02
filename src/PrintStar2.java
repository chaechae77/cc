import java.util.Scanner;

public class PrintStar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        for (int i = 0; i >sum; i++ ) {
            System.out.println();


            for (int j =0; j>sum; j++) {
                for (int k = j; k <sum ; k++) {
                    System.out.print("*");

                }


            }
            System.out.println(); //1단계 힌트 성공했다요 // 내일 다시 해봐야지...
        }
    }
}
