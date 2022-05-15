package com.hhhmemories.cloud.member.service.Impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hhhmemories.cloud.member.service.MemberVO;

@Repository("memberDAO")
public class MemberDAO {
	

	@Autowired
	   private SqlSessionTemplate sqlSession;
	
	public MemberVO selectMemberInfo(MemberVO memberVo) {
		return sqlSession.selectOne("login.selectMemberInfo", memberVo);
	}
}
