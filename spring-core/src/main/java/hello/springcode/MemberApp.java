package hello.springcode;

import hello.springcode.member.Grade;
import hello.springcode.member.Member;
import hello.springcode.member.MemberService;
import hello.springcode.member.MemberServiceImpl;
import hello.springcode.member.*;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + member.getName());
    }
}
