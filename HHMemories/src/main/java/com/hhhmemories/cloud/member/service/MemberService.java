package com.hhhmemories.cloud.member.service;

import javax.servlet.http.HttpServletResponse;

public interface MemberService {

	
	/**
	 * @param response 
	 * @Method 로그인 시도한 회원정보 조회
	 * @return 결과값
	 */
	MemberVO selectMemberInfo(MemberVO memberVo, HttpServletResponse response) throws Exception;
	
}
