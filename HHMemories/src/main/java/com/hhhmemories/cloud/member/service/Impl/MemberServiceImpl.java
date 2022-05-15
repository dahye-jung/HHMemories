package com.hhhmemories.cloud.member.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

	@Override
	public MemberVO selectMemberInfo(MemberVO memberVo) {
		
		return memberDAO.selectMemberInfo(memberVo);
	}

	
	
	
}
