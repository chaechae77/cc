public class LoginPass {
    public static void main(String[] args) {

        String[] id_pw = {"cc", "1234"};

        String[][] db = {{"ab", "12"},
                        {"cc", "1234"}};

        for (int i = 0; i < db.length; i++) {
            String dbid = db[i][0];
            String dbpassword = db[i][1];

            if (dbid.equals( id_pw[0]) && dbpassword.equals(id_pw[1])) {
                System.out.println("맞아요!!");
            }
        }
    }
}


