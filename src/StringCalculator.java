import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) { //기억이 안나..ㅠㅠㅠ
        Scanner sc = new Scanner(System.in);
        String sum = sc.nextLine();

        String[] arr = sum.split(" ");
        int cc =0;
        for (int i = 0; i < arr.length; i++) {

            if(i%2==0){
                cc+= Integer.parseInt(arr[i]);




            }

        }
        System.out.println(cc);


         // 모르겠.. 내일 다시 할...거,,ㅎㅎ 내일 다시..


    }
}
