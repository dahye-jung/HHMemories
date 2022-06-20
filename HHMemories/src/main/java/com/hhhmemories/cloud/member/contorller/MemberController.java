package com.hhhmemories.cloud.member.contorller;

import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

import lombok.extern.log4j.Log4j;

/**
 * @author 
 * @프로그램 설명 : 로그인 관련 컨트롤러
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	//암호화
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	/**
	 * 로그인 페이지(GET)
	 * 
	 * @return 로그인 페이지
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() throws Exception{
		return "login/login";	
	}
	
	/**
	 * 로그인 기능(POST)
	 * 
	 * @param memberId, memberPwd
	 * @return 로그인 기능
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String signin(MemberVO memberVo, HttpServletRequest req, RedirectAttributes rttr, HttpServletResponse response) throws Exception{
		
		HttpSession session = req.getSession();
		
		MemberVO user = memberService.selectMemberInfo(memberVo, response); // 로그인한 정보로 회원정보가 존재하는 지 조회
		
		if(user != null) { // 로그인 시도한 아이디가 실제로 존재할 경우
			boolean passMatch = passwordEncoder.matches(memberVo.getMemberPw(), user.getMemberPw()); // 입력한 패스워드와 DB에 저장되어 있는 패스워드 비교	

			if (passMatch) { // 패스워드가 동일할 경우	
				logger.info("Method signin >>>>>>>> Login Success");
				session.setAttribute("member", user);
			} else { // 패스워드가 틀릴 경우.
				logger.info("Method signin >>>>>>>> Login Fail");
				session.setAttribute("member", null);
				rttr.addFlashAttribute("msg", "비밀번호를 확인해주세요");
				return "redirect:/login/login";
			}
		}

		return "redirect:/index";
	}
	
	/**
	 * 로그아웃
	 * 
	 * @param 
	 * @return 메인 페이지
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logOut(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		 new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder
	                .getContext().getAuthentication());
		
		return "redirect:/index";
	}
	
	/**
	 * 회원가입 페이지(GET)
	 * 
	 * @return 회원가입 페이지
	 * @throws Exception
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUpForm(MemberVO memberVo) throws Exception{
		
		return "login/signup";
	}
	
	/**
	 * 회원가입 기능(POST)
	 * 
	 * @return 회원가입 기능
	 * @param HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr
	 * @throws Exception
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUp(HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr) throws Exception{
		
		String pass = passwordEncoder.encode(memberVo.getMemberPw());
		
		memberVo.setMemberPw(pass);
		memberService.insertMember(memberVo);
		
		return "login/signUpComplete";
	}
	
	/**
	 * 아이디찾기 페이지
	 * 
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findId" , method = RequestMethod.GET)
	public String findIdForm() throws Exception{ 
		
		return "login/findId";
	}
	
	/**
	 * 아이디찾기 기능
	 * 
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findId" , method = RequestMethod.POST)
	public String findId() throws Exception{ 
		
		return "";
	}
	
	/**
	 * 비밀번호찾기 기능
	 * 
	 * @param MemberVO memberVo, HttpServletResponse response
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findPwd", method = RequestMethod.GET)
	public String findPwdForm(MemberVO memberVo, HttpServletResponse response) throws Exception{
		
		
		return "login/findPwd";
	}
	
	/**
	 * 비밀번호찾기 기능
	 * 
	 * @param MemberVO memberVo, HttpServletResponse response
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findPwd", method = RequestMethod.POST)
	public String findPwd(MemberVO memberVo, HttpServletResponse response) throws Exception{
		
		// 이름, 아이디, 이메일로 계정이 있는지 조회
		memberVo = memberService.selectMemberInfo(memberVo, response);
		
		String pw = tempPassword(10); // 임시비밀번호 설정
		
		return "";
	}
	
	
	/**
	 * 임시 비밀번호 작성 함수
	 * 
	 * @param leng
	 * @throws Exception
	 */
	public static String tempPassword(int leng) throws Exception{
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
