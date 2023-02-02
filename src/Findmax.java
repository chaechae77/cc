public class Findmax {
    public static void main(String[] args) {
        int[] array = {1,8,3,9};
        int max = 0;
        int idx =0;
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
                idx = i;
            }

        }
        System.out.printf("%d, %d",max,idx);
    }
}
