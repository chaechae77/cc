import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // 값을 입력받기 위한 Scanner 생성
        Scanner sc = new Scanner(System.in);

        // 3 + 5 - 2 형태로 입력!
        String input = sc.nextLine();

        // 입력 받은 내용을 공백(띄어쓰기) 기준으로 자르기! -> 배열화
        String[] arr = input.split(" ");

        // 누적된 값을 저장하기 위한 변수!
        // 미리 첫 값을 처음 수로 지정!
        int result = Integer.parseInt(arr[0]);

        // i는 1부터(연산자만 구하기 위함) 진행
        // i는 배열의 길이 마지막 전까지만 진행(마지막 원소는 숫자이기 때문!)
        // i는 ++이 아닌 홀수 자리만 보기 위해 i+=1 사용!
        // 즉, i는 1 -> 3 -> 5 -> 7 -> ... 홀수만 보게 됌!
        for (int i = 1; i < arr.length-1; i+=1) {
            // 연산자가 +일 때와 -일 때에 대한 로직!
            if (arr[i].equals("+")) {
                // arr[i]는 연산자이기 때문에 arr[i + 1]의 값을 가져와 누적합!
                result += Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("-")) {
                result -= Integer.parseInt(arr[i + 1]); //3은 어떻게 되는 겨..?
            }
        }

        System.out.println("result = " + result);

    }
}