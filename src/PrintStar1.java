import java.util.Scanner;

public class PrintStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        for (int i = 0; i < sum; i++) {
            for (int j = sum; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // 이새벽 1시 30분깢하고 안되면 다음 문제 풀거야
            System.out.println();} // 깃허브에 올리고 싶은데 글씨가 안 써져요!!
    }
}