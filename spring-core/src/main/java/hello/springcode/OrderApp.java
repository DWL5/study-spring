package hello.springcode;

import hello.springcode.member.Grade;
import hello.springcode.member.Member;
import hello.springcode.member.MemberService;
import hello.springcode.member.MemberServiceImpl;
import hello.springcode.order.Order;
import hello.springcode.order.OrderService;
import hello.springcode.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
