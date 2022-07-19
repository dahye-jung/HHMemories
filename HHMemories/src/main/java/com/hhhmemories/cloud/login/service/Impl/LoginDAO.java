package com.hhhmemories.cloud.login.service.Impl;

import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hhhmemories.cloud.login.service.LoginVO;

@Repository("loginDAO")
public class LoginDAO {
    
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    public LoginVO selectMemberInfo(LoginVO loginVo, HttpServletResponse response) throws Exception {
        return sqlSession.selectOne("login.selectMemberInfo", loginVo);
    }

}
