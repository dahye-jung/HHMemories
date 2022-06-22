package com.hhhmemories.cloud.member.service;

import javax.servlet.http.HttpServletResponse;

public interface MemberService {

	
	/**
	 * 로그인
	 * 
	 * @param MemberVO memberVo, HttpServletResponse response
	 * @throws Exception
	 */
	MemberVO selectMemberInfo(MemberVO memberVo, HttpServletResponse response) throws Exception;
	
	/**
	 * 회원가입
	 * 
	 * @param MemberVO memberVo
	 * @throws Exception
	 */
	int insertMember(MemberVO memberVo) throws Exception;

	/**
	 * 아이디 찾기
	 * 
	 * @param String memberEmail
	 * @throws Exception
	*/
	MemberVO findId(String memberEmail) throws Exception;
}
