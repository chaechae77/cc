package Post;

public class Post {
    // 필드(속성)
    private int id;
    protected String title;
    private String content;
    private String writer;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        // this 현재 클래스의 필드를 나타냄
        this.id = id;
    }
}
