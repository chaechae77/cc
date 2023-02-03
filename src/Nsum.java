import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int sum =0;
        for (int i = 0; i < n.length(); i++) { //n은 배열이 아니지..?
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(sum);
    }
}
