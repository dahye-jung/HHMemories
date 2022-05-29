package com.hhhmemories.cloud.member.contorller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//암호화
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
		
		MemberVO memberVo = new MemberVO();
		
		memberId = "test101";
		memberVo.setMemberId(memberId);
		
		// 입력한 아이디와 비밀번호를 DB에서 조회(select)
		memberVo = memberService.selectMemberInfo(memberVo);
		
		logger.info("INFO ::: " + memberVo);
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
	public String findUserPwd(MemberVO memberVo) {
		
		memberVo = memberService.selectMemberInfo(memberVo);
		
		String pw = tempPassword(10); // 임시비밀번호 설정
		
		return "";
	}
	
	// 임시 비밀번호 작성 함수
	public static String tempPassword(int leng){
		int index = 0;
		char[] charSet = new char[] {
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
		};	//배열안의 문자 숫자는 원하는대로

		StringBuffer password = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < leng ; i++) {
			double rd = random.nextDouble();
			index = (int) (charSet.length * rd);
			
			password.append(charSet[index]);
			
			System.out.println("index::" + index + "	charSet::"+ charSet[index]);
		}
		
		return password.toString(); 
	    //StringBuffer를 String으로 변환해서 return 하려면 toString()을 사용하면 된다.
	}	

}
