package com.ll.basic1.boundedContext.member.service;

import com.ll.basic1.base.rsData.RsData;
import com.ll.basic1.boundedContext.member.Entity.Member;
import com.ll.basic1.boundedContext.member.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = new MemberRepository();
    }

    public RsData tryLogin(String username, String password) {

        Member member = memberRepository.findByUsername(username);


        if (member == null) {
            return new RsData("F-2", "%s는 존재하지 않는 회원입니다.".formatted(username));
        }
        if (!member.getPassword().equals(password)) {
            return new RsData("F-1", "비밀번호가 일치하지 않습니다.");
        }
        return new RsData("S-1", "%s 님 환영합니다.".formatted(username));
    }
}
