package com.hhhmemories.cloud.member.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hhhmemories.cloud.index.controller.IndexController;
import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

/**
 * @author 
 * @프로그램 설명 : 로그인 관련 컨트롤러
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	// 로그인 페이지 이동
	@RequestMapping(value = "/login")
	public String loginPage() throws Exception{
		return "login/login";	
	}
	
	/**
	 * @Method 회원가입 기능
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/signin")
	public String signIn(MemberVO memberVo) {
		
		return "";
	}
	
	/**
	 * @Method 로그인 기능
	 * @param memberId(로그인 아이디)
	 * @param memberPwd(로그인 비밀번호)
	 * @return ?
	 */
	@RequestMapping(value = "/signup")
	public String signUp(String memberId, String memberPwd) {
		
		// 입력한 아이디와 비밀번호를 DB에서 조회(select)
		// 리턴값이 존재하면
		// 기록을 위해 로그인 정보 DB에 업데이트(update)
		// 세션에 로그인 정보 저장
		// 로그인 자동 유지 시간 30분으로 설정
		
		return "";
	}
	
	// 로그아웃 기능
	@RequestMapping(value = "/logout")
	public String logOut() {
		
		//세션에 등록된 로그인 정보 삭제
		
		return "";
	}
	
	// 아이디 찾기 기능
	@RequestMapping(value = "/findid")
	public String findUserId() { 
		
		return "";
	}
	
	// 비빌번호 찾기 기능
	@RequestMapping(value = "/findpwd")
	public String findUserPwd() {
		
		return "";
	}
	
	
}
