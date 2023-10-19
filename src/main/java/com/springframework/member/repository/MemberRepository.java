package com.springframework.member.repository;

import com.springframework.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
	public int save(MemberDTO memberDTO) {
		System.out.println("memberDTO = " + memberDTO);
		return 0;
	}
}
