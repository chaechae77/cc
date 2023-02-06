public class ArrTest2{

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d \t", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        // 배열 생성
        int[] arr = new int[5];

        // 배열 원소값 지정
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        // 배열 출력
        printArr(arr);

        // 배열 값 변경
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + (i + 1);
        }

        // 배열 출력
        printArr(arr);
    }
}