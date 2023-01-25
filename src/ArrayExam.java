public class ArrayExam {
    public static void main(String[] args) {
        int[] cc = new int [7];
        System.out.println(cc.length);

        for (int i = 0; i < cc.length; i++) {
            cc[i] = i;
        }

        System.out.println("------------------------------");

        for (int i=0; i < cc.length; i++){
            System.out.println(cc[i]);
        }

        System.out.println("------------------------------");

        for (int i = cc.length - 1; i >= 0; i--) {
            System.out.println(cc[i]);
        }

        System.out.println("------------------------------");

        for (int c : cc) {
            System.out.println("c = " + c);
        }
    }
}
