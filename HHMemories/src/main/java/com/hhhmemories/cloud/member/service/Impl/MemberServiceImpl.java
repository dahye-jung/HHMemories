package com.hhhmemories.cloud.member.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;

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

	@Override
	public MemberVO findPwdUserInfo(MemberVO memberVo) {
		// TODO Auto-generated method stub

		return memberDAO.findPwd(memberVo);
	}

	@Override
	public int updatePassword(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberDAO.updateTempPassword(vo);
	}

	@Override
	public int emailCheck(MemberVO memberVo) throws Exception {
		int result = memberDAO.emailCheck(memberVo);
		return result;
	}

	
}
