package hello.spring;

import hello.spring.controller.MemberController;
import hello.spring.repository.MemberRepository;
import hello.spring.repository.MemoryMemberRepository;
import hello.spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
