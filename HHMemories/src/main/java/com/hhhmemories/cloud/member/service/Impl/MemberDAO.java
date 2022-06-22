package com.hhhmemories.cloud.member.service.Impl;

import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hhhmemories.cloud.member.service.MemberVO;

@Repository("memberDAO")
public class MemberDAO {
	

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public MemberVO selectMemberInfo(MemberVO memberVo, HttpServletResponse response) throws Exception {
		return sqlSession.selectOne("member.selectMemberInfo", memberVo);
	}
	
	public int insertMember(MemberVO memberVo) throws Exception {
		return sqlSession.insert("member.insertMember", memberVo);
	}

	public Object findId(String memberEmail) throws Exception {
		return sqlSession.selectOne("member.findId",memberEmail);
	}
}
