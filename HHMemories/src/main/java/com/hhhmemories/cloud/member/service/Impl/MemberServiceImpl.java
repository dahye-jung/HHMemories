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

	@Override
	public MemberVO selectMemberInfo(MemberVO memberVo, HttpServletResponse response) throws Exception {
		return memberDAO.selectMemberInfo(memberVo, response);
	}

	@Override
	public int updateMemberPassword(MemberVO memberVo) throws Exception {
		return memberDAO.updateMemberPassword(memberVo);
	}

	
	
	
}
