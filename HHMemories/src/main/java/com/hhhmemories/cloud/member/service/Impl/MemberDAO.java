package com.hhhmemories.cloud.member.service.Impl;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hhhmemories.cloud.member.service.MemberVO;

@Repository("memberDAO")
public class MemberDAO {
	

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertMember(MemberVO memberVo) throws Exception {
		return sqlSession.insert("member.insertMember", memberVo);
	}

	public MemberVO findId(MemberVO memberVo) throws Exception {
		return sqlSession.selectOne("member.findId",memberVo);
	}

	public int idCheck(MemberVO memberVo) throws Exception {
		int result = sqlSession.selectOne("member.idCheck",memberVo);
		return result;
	}

	public int emailCheck(MemberVO memberVo) {
		int result = sqlSession.selectOne("member.emailCheck",memberVo);
		return result;
	}
	
	public MemberVO findPwd(MemberVO memberVo) {
		return sqlSession.selectOne("member.findPwd",memberVo);
	}

	public int updateTempPassword(MemberVO vo) {
		// TODO Auto-generated method stub
		HashMap hash = new HashMap<>();
		
		hash.put("memberId", vo.getMemberId());
		hash.put("memberEmail", vo.getMemberEmail());
		hash.put("memberPw", vo.getMemberPw());
		
		return sqlSession.update("member.updateTempPassword",hash);
	}
}
