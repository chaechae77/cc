import java.util.Scanner; // 함수를 어떻게 만드는지 모르겠따 ㅠㅠ

public class IceAmericano {
    public static void main(String[] args) {
        System.out.println("가지고 있는 돈을 입력하세요"); //실행하면 자꾸 다른 코드로 돌아가는데 그거 알려달라고 하기!!!
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        int ice = 5500;
        int cnt = 0;

        int cc=0;
        if (ice <= str) {
            cnt = str/ice;

            cc=str%ice;
        }
        System.out.println("cnt =" + cnt);
        System.out.println("cc =" + cc);

        }
    }

