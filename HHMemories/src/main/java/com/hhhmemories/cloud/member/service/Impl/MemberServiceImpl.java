package com.hhhmemories.cloud.member.service.Impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

	/**
	 * 로그인
	 * 
	 * @param MemberVO memberVo, HttpServletResponse response
	 * @throws Exception
	 */
	@Override
	public MemberVO selectMemberInfo(MemberVO memberVo, HttpServletResponse response) throws Exception {
		return memberDAO.selectMemberInfo(memberVo, response);
	}

	/**
	 * 회원가입
	 * 
	 * @param MemberVO memberVo
	 * @throws Exception
	 */
	@Override
	public int insertMember(MemberVO memberVo) throws Exception {
		return memberDAO.insertMember(memberVo);
	}

	/**
	 * 아이디 찾기
	 * 
	 * @param HttpServletResponse response, String memberEmail
	 * @throws Exception
	*/
	@Override
	public MemberVO findId(MemberVO memberVo) throws Exception {
		return memberDAO.findId(memberVo);
	}

	@Override
	public int idCheck(MemberVO memberVo) throws Exception {
		int result = memberDAO.idCheck(memberVo);
		return result;
	}

	
	
	
}
