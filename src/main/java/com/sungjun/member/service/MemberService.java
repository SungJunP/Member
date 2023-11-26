package com.sungjun.member.service;

import com.sungjun.member.dto.MemberDTO;
import com.sungjun.member.entity.MemberEntity;
import com.sungjun.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity 변환
        // 2. repository 의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
        // repository의 save 메서드 호출 (조건. entity 객체를 넘겨줘야 한다)
    }

    public MemberDTO login(MemberDTO memberDTO) {
        /*
            1. 회원이 입력한 이메일로 DB에서 조회를 한다.
            2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단한다.
         */
    }
}
