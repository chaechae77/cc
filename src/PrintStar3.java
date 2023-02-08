import java.util.Scanner;

public class PrintStar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("*"); //여기에는 println을 붙이면 안되는 이유
                
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }

            System.out.println();}
    }
}
