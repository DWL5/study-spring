package hello.springcode.order;

import hello.springcode.discount.DiscountPolicy;
import hello.springcode.discount.FixDiscountPolicy;
import hello.springcode.member.Member;
import hello.springcode.member.MemberRepository;
import hello.springcode.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
