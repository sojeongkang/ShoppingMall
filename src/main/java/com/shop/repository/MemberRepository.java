package com.shop.repository;

import com.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //회원가입 시 이메일로 중복 회원 검사
    Member findByEmail(String email);

}
