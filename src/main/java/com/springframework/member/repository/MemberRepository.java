package com.springframework.member.repository;

import com.springframework.member.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
	private final SqlSessionTemplate sql;
	public int save(MemberDTO memberDTO) {
		System.out.println("memberDTO = " + memberDTO);
		return sql.insert("Member.save", memberDTO);
	}

	public MemberDTO login(MemberDTO memberDTO) {
		return sql.selectOne("Member.login", memberDTO);
	}
}
