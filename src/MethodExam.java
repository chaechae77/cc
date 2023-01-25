import java.util.Scanner;

public class MethodExam {
        public static int numSum(int a, int b) {
            return a + b;
        }

        public static int numMinus(int a, int b) {
            return a-b;
        }

        public static int numCalc(int c, int d, String s) {
            /*if (s.equals("-")){
                return c-d;
            } else if(s.equals("+")){
                return c+d;
            } else if(s.equals("*")){
                return c*d;
            } else if(s.equals("/")){
                return c/d;
            }
            return 0;*/
            return switch (s) {
                case "-" -> c - d;
                case "+" -> c + d;
                case "*" -> c * d;
                case "/" -> c / d;
                default -> 0;
            };
        }



        public static void main(String[] args){


            for (int i = 0; i < 3; i++) {
                Scanner cc = new Scanner(System.in);
                int c = cc.nextInt();
                int d = cc.nextInt();
                String e = cc.next();

//                System.out.println(numSum(c, d));
//                System.out.println(numMinus(c,d));
                System.out.println(numCalc(c,d, e));
            }


        }
}
