package hello.springcode.discount;

import hello.springcode.member.Member;

public interface DiscountPolicy {

    /**
     * @return 대상할인금액
     */
    int discount(Member member, int price);
}
