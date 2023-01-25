public class ArrayExam3 {
    public static void main(String[] args) {
        int[] cc = new int[1000];

        for (int i = 0; i < cc.length; i++) cc[i] = i;


        for (int i = 0; i < cc.length; i++) {
            if (i % 2 == 0) {
                System.out.println(cc[i]);
                if (i == 70)  break;
            }
        }

        for (int i = 0; i < cc.length; i++) {
            if (i%2==1 && i*9==27) {
            }
                System.out.println(i);
        }
    }
}
