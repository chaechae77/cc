package member;

public class Member {
    String username;
    String password;
    String phone;

    public Member(){}

    public Member(String username, String password, String phone){
        this.username = username;
        this.password = password;
        this.phone = phone;
    }


    void setBasicInfo(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }
}
