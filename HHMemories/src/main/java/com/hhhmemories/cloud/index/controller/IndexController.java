package com.hhhmemories.cloud.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/index")
	public String index() throws Exception {
		logger.debug("Hey, Log4j2!");
		logger.info("Hey, Log4j2!");
		logger.warn("Hey, Log4j2!");
		
		return "index";
	}
	
	
	
}
