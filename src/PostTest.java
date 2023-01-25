import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String title = sc.next();
        String content = sc.next();
        String writer = sc.next();

        Post post = new Post();
        post.setBasicInfo(id,title, content, writer);
        System.out.println(post.id);

    }
}
