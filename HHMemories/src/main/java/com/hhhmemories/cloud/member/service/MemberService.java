package com.hhhmemories.cloud.member.service;

public interface MemberService {

	
	/**
	 * @Method 로그인 시도한 회원정보 조회
	 * @return 결과값
	 */
	MemberVO selectMemberInfo(MemberVO memberVo);
	
}
