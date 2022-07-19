package com.hhhmemories.cloud.login.service.Impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhhmemories.cloud.login.service.LoginService;
import com.hhhmemories.cloud.login.service.LoginVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    
    @Autowired
    LoginDAO loginDAO;

    /**
     * 로그인
     * 
     * @param MemberVO memberVo, HttpServletResponse response
     * @throws Exception
     */
    @Override
    public LoginVO selectMemberInfo(LoginVO loginVo, HttpServletResponse response) throws Exception {
        return loginDAO.selectMemberInfo(loginVo, response);
    }

}
