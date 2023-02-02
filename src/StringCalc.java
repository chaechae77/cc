import java.util.Scanner;

public class StringCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(input);

        String[] arr = input.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                sum+=Integer.parseInt(arr[i]);


            }

        }

        System.out.println(sum);


    }
}
