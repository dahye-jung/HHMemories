package com.hhhmemories.cloud.login.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hhhmemories.cloud.index.controller.IndexController;
import com.hhhmemories.cloud.login.service.LoginService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login")
	public String loginPage() throws Exception{
		return "login/login";
		
	}

}
