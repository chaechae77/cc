import java.util.ArrayList;
import java.util.List;


public class ListTest {
    public static void main(String[] args) {
        int [] arr = new int[5];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;


        List<Integer> numList = new ArrayList<>();
        numList.add(0);
        numList.add(1);
        numList.add(2);

        Integer NUM = numList.get(2);
        System.out.println(NUM);
    }
}
