package com.hhhmemories.cloud.login.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhhmemories.cloud.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
}
