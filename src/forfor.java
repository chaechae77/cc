import java.util.Scanner;

public class forfor {
    public static void main(String[] args) {
        System.out.println("수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j =num; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
