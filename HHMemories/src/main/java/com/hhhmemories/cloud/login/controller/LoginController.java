package com.hhhmemories.cloud.login.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hhhmemories.cloud.login.service.LoginService;
import com.hhhmemories.cloud.login.service.LoginVO;
import com.hhhmemories.cloud.member.contorller.MemberController;

@Controller
public class LoginController {

private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
    @Resource(name = "loginService")
    private LoginService loginService;
    
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
     * @param Model model,MemberVO memberVo, HttpServletRequest req, RedirectAttributes rttr, HttpServletResponse response
     * @return 로그인 기능
     * @throws Exception
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String signin(LoginVO loginVo, HttpServletRequest req, RedirectAttributes rttr, HttpServletResponse response) throws Exception{
        
        HttpSession session = req.getSession();
        
        LoginVO user = loginService.selectMemberInfo(loginVo, response); // 로그인한 정보로 회원정보가 존재하는 지 조회
        
        if(user != null) { // 로그인 시도한 아이디가 실제로 존재할 경우
            boolean passMatch = passwordEncoder.matches(loginVo.getMemberPw(), user.getMemberPw()); // 입력한 패스워드와 DB에 저장되어 있는 패스워드 비교   

            if (passMatch) { // 패스워드가 동일할 경우    
                logger.info("Method signin >>>>>>>> Login Success");
                session.setAttribute("member", user);
            } else { // 패스워드가 틀릴 경우.
                logger.info("Method signin >>>>>>>> Login Fail");
                session.setAttribute("member", null);
                rttr.addFlashAttribute("msg", "비밀번호를 확인해주세요");
                return "redirect:/login";
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
    
}
