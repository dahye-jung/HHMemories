package com.hhhmemories.cloud.member.service;

import java.util.List;

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
	 * @param MemberVO memberVo
	 * @throws Exception
	
	String findId(MemberVO memberVo) throws Exception; */
	
}
