package com.hhhmemories.cloud.member.contorller;

import java.util.Random;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hhhmemories.cloud.mail.controller.mailController;
import com.hhhmemories.cloud.member.service.MemberService;
import com.hhhmemories.cloud.member.service.MemberVO;

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
	
	@Autowired
	private mailController mailController;
	
	@Autowired
	private JavaMailSender mailSender;
	 
	
	/**
	 * 회원가입 페이지(GET)
	 * 
	 * @return 회원가입 페이지
	 * @throws Exception
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUpForm(MemberVO memberVo) throws Exception{
		
		return "member/signup";
	}
	
	/**
	 * 회원가입 기능(POST)
	 * 
	 * @return 회원가입 기능
	 * @param HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr
	 * @throws Exception
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUp(HttpServletRequest httpreq,Model model,@Validated MemberVO memberVo,HttpServletResponse response, RedirectAttributes rttr,BindingResult result, Errors errors) throws Exception{

	    if(errors.hasErrors()) {
            //회원가입 실패시 입력 데이터 값을 유지
            model.addAttribute("memberVo",memberVo);
            
            return "member/signup";
        
        }
	    
		String pass = passwordEncoder.encode(memberVo.getMemberPw());
		
		memberVo.setMemberPw(pass);
		
		int idCheck = memberService.idCheck(memberVo);
		int emailCheck = memberService.emailCheck(memberVo);
		
		if(idCheck == 0 || emailCheck == 0 ) {
			memberService.insertMember(memberVo);
			model.addAttribute("result",true);
		}
		
		
		model.addAttribute("memberId", memberVo.getMemberId());
		model.addAttribute("memberNm", memberVo.getMemberNm());
		model.addAttribute("memberEmail", memberVo.getMemberEmail());
		
		return "member/signUpComplete";
	}
	
	/**
	 * 회원가입 - 아이디 중복확인(POST)
	 * 
	 * @return 회원가입 기능
	 * @param HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public int idCheck(MemberVO memberVo) throws Exception{

		int result = memberService.idCheck(memberVo);
		return result;
		
	}
	
	/**
	 * 회원가입 - 이메일 중복체크(POST)
	 * 
	 * @return 회원가입 기능
	 * @param HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/emailCheck", method = RequestMethod.POST)
	public int emailCheck(MemberVO memberVo) throws Exception{
		
		int result = memberService.emailCheck(memberVo);
		return result;
		
	}
	
	/**
	 * 회원가입 - 이메일 인증번호(POST)
	 * 
	 * @return 회원가입 기능
	 * @param HttpServletRequest httpreq,Model model,MemberVO memberVo, RedirectAttributes rttr
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/emailSend", method = RequestMethod.GET)
	public String emailSend(String memberEmail) throws Exception{
		
        /* 인증번호(난수) 생성 */
        Random random = new Random();
        int checkNum = random.nextInt(888888) + 111111;
        
        logger.info("이메일 전송 확인 되라ㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
        logger.info("인증번호" + memberEmail);
        
        /* 이메일 보내기 */
        String setFrom = "hyesounglee@naver.com";
        String toMail = memberEmail;
        String title = "회원가입 인증 이메일 입니다.";
        String content = 
                "HHMemories를 방문해주셔서 감사합니다." +
                "<br><br>" + 
                "인증 번호는 " + checkNum + "입니다." + 
                "<br>" + 
                "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";
		
		  try {
		  
				MimeMessage message = mailSender.createMimeMessage();
				MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
				helper.setFrom(setFrom);
				helper.setTo(toMail);
				helper.setSubject(title);
				helper.setText(content, true);
				mailSender.send(message);
		  
		  }catch(Exception e) { e.printStackTrace(); }
		 
 
        String num = Integer.toString(checkNum);
		
        return num;
	}
	
	/**
	 * 회원가입 완료 페이지
	 * 
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/signUpComplete" , method = RequestMethod.GET)
	public String signUpComplete() throws Exception{ 
		
		return "member/signUpComplete";
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
		
		return "member/findId";
	}
	
	/**
	 * 아이디찾기 기능
	 * 
	 * @param Model model,  @RequestParam("memberEmail") String memberEmail
	 * @return member/findIdConfirm
	 * @throws Exception
	 */
	@RequestMapping(value = "/findId" , method = RequestMethod.POST)
	public String  findId(Model model, MemberVO memberVo) throws Exception{ 
		
		MemberVO member = memberService.findId(memberVo);
		
		if(member != null) {
			model.addAttribute("memberId", member.getMemberId());
			model.addAttribute("memberNm", member.getMemberNm());
			model.addAttribute("regDt", member.getRegDt());
		}else {
			return "member/findIdReConfirm";
		}
		
		return "member/findIdConfirm";
	}
	
	/**
	 * 아이디찾기 성공시
	 * 
	 * @param 
	 * @return login/findIdConfirm
	 * @throws Exception
	 */
	@RequestMapping(value = "/findIdConfirm" , method = RequestMethod.GET)
	public String  findIdConfirm() throws Exception{ 
		
		return "member/findIdConfirm";
	}
	
	/**
	 * 아이디찾기 실패시
	 * 
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findIdReConfirm" , method = RequestMethod.GET)
	public String  findIdReConfirm(Model model) throws Exception{ 
		
		return "member/findIdReConfirm";
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
		
		
		return "member/findPwd";
	}
	
	/**
	 * 비밀번호찾기 기능
	 * 
	 * @param MemberVO memberVo, HttpServletResponse response
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping(value = "/findPwd", method = RequestMethod.POST)
	public String findPwd(MemberVO to, HttpServletResponse response, Model model) throws Exception{
		
		// 이름, 아이디, 이메일로 계정이 있는지 조회
		
		MemberVO vo = memberService.findPwdUserInfo(to);
		System.out.println("개인정보 : " + to.toString());
		
		// 입력한 정보로 조회한 값이 존재할 경우
		if(vo != null) {
			
			// 임시비밀번호 설정
			String pw = tempPassword(10); 
			
			// 임시비밀번호 입력한 메일로 전송
			mailController.naverMailSend(to.getMemberEmail(), to.getMemberId(), pw);
			
			// 임시비밀번호 암호화
			String tempPassword = passwordEncoder.encode(pw);
			
			// 생성된 임시비밀번호 VO에 저장
			vo.setMemberPw(tempPassword);
			
			// 임시비밀번호 DB에 저장
			int result = memberService.updatePassword(vo);
			System.out.println("결과  : " + result);
			
			model.addAttribute("memberEmail", vo.getMemberEmail());
			model.addAttribute("memberNm", vo.getMemberNm());
			
			return "member/findPwConfirm";
		}


		return "member/findIdReConfirm";
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

	//인증번호(숫자)
	 public static String createKey()throws Exception{
	      StringBuffer key = new StringBuffer();
	      Random rnd = new Random();

	      for (int i = 0; i < 5; i++) { 
	    	 int index = rnd.nextInt(3);
	           switch (index) {
	           case 0:
	               key.append(((int) (rnd.nextInt(10))));
	               break;
	           case 1:
	               key.append(((int) (rnd.nextInt(10))));
	               break;
	           case 2:
	               key.append((rnd.nextInt(5)));
	               break;
	       }
	    }
	    return key.toString();
	   }
	
}
