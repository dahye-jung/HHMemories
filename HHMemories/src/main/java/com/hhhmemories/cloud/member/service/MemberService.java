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
	
	int idCheck(MemberVO memberVo) throws Exception;
	
	int emailCheck(MemberVO memberVo)throws Exception;

	/**
	 * 아이디 찾기
	 * 
	 * @param String memberEmail
	 * @throws Exception
	*/
	MemberVO findId(MemberVO memberVo) throws Exception;

	/**
	 * 비밀번호 찾기
	 * 
	 * @param MemberVO memberVo
	 * @throws Exception
	*/
	MemberVO findPwdUserInfo(MemberVO memberVo);

	/**
	 * 임시 비밀번호 저장
	 * 
	 * @param String tempPassword
	 * @throws Exception
	*/
	int updatePassword(MemberVO vo);
}
