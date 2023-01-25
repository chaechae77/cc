package test;

import java.util.Scanner;

public class FishBreadService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FishBread 팥붕 = new FishBread();
        String a반죽 = sc.next();
        팥붕.반죽 = a반죽;
        팥붕.재료 = "팥";

        FishBread 고붕 = new FishBread();

        고붕.반죽 = "밀가루";
        고붕.재료 = "고구마";

        System.out.println(팥붕.재료);

    }
}
