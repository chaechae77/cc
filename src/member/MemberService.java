package member;

import java.util.Scanner;

public class MemberService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        String phone = sc.next();

        Member newMember1 = new Member();
        newMember1.setBasicInfo(username, password, phone);

        Member newMember2 = new Member(username, password, phone);
        System.out.println(newMember2.username);
    }
}
