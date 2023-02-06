public class Question1 {
    public static int findQuarter(int month) {

       /* if (month == 1 && month == 2 && month == 3) {
            System.out.println("1");
        } else if (month == 4 && month == 5 && month == 6) {
            System.out.println(2);
        }
*/
        int cc = 0;
        switch (month) {
            case 1, 2, 3:
                cc=1;
                break;
            case 4, 5, 6:
                cc=(2);
                break;
            case 7, 8, 9:
                cc =(3);
                break;
            default:
                cc =(4);
        }

        return switch (month) {
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            default -> 4;
        };
    }
    public static void main(String[] args) {

        // 1 출력
        System.out.println(findQuarter(3));
        // 3출력
        System.out.println(findQuarter(8));
    }
}
