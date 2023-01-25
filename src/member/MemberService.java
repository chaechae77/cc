package member;

import java.util.Scanner;

public class MemberService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        String phone = sc.next();

        Member newMember = new Member();
        newMember.setBasicInfo(username, password, phone);

//        newMember.username = username;
//        newMember.password = password;
//        newMember.phone = phone;

        System.out.println(newMember.username);
    }
}
