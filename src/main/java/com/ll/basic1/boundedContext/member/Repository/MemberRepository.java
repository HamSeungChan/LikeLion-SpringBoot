package com.ll.basic1.boundedContext.member.Repository;

import com.ll.basic1.boundedContext.member.Entity.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private final List<Member> memberList;

   public MemberRepository(){
        memberList = new ArrayList<>();

        memberList.add(new Member("user1","1234"));
        memberList.add(new Member("abc","12345"));
        memberList.add(new Member("test","123456"));
        memberList.add(new Member("love","12347"));
        memberList.add(new Member("like","12348"));
        memberList.add(new Member("","12349"));
        memberList.add(new Member("thanks","123410"));
        memberList.add(new Member("hello","123411"));
        memberList.add(new Member("good","123412"));
        memberList.add(new Member("peace","123413"));

    }

    public Member findByUsername(String username){
        return memberList.stream()
                .filter(m->m.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

}
