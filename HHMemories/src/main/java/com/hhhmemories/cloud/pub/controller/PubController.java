package com.hhhmemories.cloud.pub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PubController {

	@RequestMapping(value = "/pubIndex")
	public String index() throws Exception{
		return "pub/pubIndex";
	}
}
