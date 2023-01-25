import java.util.Scanner;

public class ScannerExam
{
    public static void main(String[] args) {

        System.out.println();
       // 입력을 받기위한 Scanner
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
