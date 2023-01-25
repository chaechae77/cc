public class Array2d {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 60, 40}
                , {50, 50, 50}
        };
//        System.out.println(score[3][1]);

        for (int i = 0; i < score.length; i++) {

            for (int j = 0; j < score[0].length; j++) {
                System.out.print(score[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
