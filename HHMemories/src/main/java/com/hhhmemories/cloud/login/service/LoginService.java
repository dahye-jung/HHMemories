package com.hhhmemories.cloud.login.service;

import javax.servlet.http.HttpServletResponse;

public interface LoginService {
    
    /**
     * 로그인
     * 
     * @param MemberVO memberVo, HttpServletResponse response
     * @throws Exception
     */
    LoginVO selectMemberInfo(LoginVO loginVo, HttpServletResponse response) throws Exception;
    

}
