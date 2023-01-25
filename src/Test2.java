public class Test2 {
    public static void main(String[] args) {
        int money = 100000;
        int iPhonePrice = 95000, kurumiDollPrice = 3000, keyboardPrice = 12000;
        int cnt = 0;

        if(iPhonePrice <= money){
            money -= iPhonePrice;
            cnt++;
        }

        if(kurumiDollPrice <= money){
            money -= kurumiDollPrice;
            cnt++;
        }

        if(keyboardPrice <= money){
            money -= keyboardPrice;
            cnt++;
        }

        System.out.println("cnt = " + cnt);
        System.out.println("money = " + money);
    }
}
