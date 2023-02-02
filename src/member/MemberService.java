package member;

import java.util.Scanner;

public class MemberService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "채채";
        String password = "123";
        String phone = "112";

        Member newMember1 = new Member();
        newMember1.setUsername("채채");
        System.out.println(newMember1.getUsername());
    }
}
