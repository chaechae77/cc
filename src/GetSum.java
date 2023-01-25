public class GetSum {
    public static void main(String[] args) {
        int y = 0;

        for (int i=1; i<=10; i++){
            y += i;
        }
        int i = 0;
        while (i<=10){
            System.out.println(i++);
        }

        int n = 10;
        System.out.println(++n);
        System.out.println(n++);
        System.out.println(n);

        System.out.println(y);
    }
}
