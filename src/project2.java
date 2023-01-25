import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        System.out.print("채윤이에게 전달할 말을 작성해주세요");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf("사용자가 채윤이에게 %s라고 전했습니다", str);
    }
}
