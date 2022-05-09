package com.hhhmemories.cloud.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PubController {

	@RequestMapping(value = "/pubIndex")
	public String index() throws Exception{
		return "pub/pubIndex";
	}
	

	@RequestMapping(value = "/sample-login-layout")
	public String test() throws Exception{
		return "pub/sample/sample-login-layout";
	}

}
