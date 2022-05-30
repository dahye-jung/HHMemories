package com.hhhmemories.cloud.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(Model model , Authentication authentication) throws Exception {
		
		/*
		 * MemberVO memberVO = (MemberVO)authentication.getPrincipal(); //회원 객체를 가져옴
		 * 
		 * model.addAttribute("info", memberVO.getMemberId() + "의" +
		 * memberVO.getMemberNm()+"님");
		 */
		
		return "index";
	}
	
	
	
}
