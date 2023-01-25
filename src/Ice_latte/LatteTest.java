package Ice_latte;

public class LatteTest {
    public static void main(String[] args) {

        String milk = "초코우유";
        String ice = "얼음";
        String espresso = "7샷";

        IceLatte latteTest = new IceLatte(milk, ice, espresso);

        System.out.println(latteTest.milk);

    }
}
