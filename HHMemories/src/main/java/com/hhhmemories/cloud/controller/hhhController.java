package com.hhhmemories.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hhhController {

	@GetMapping("test2")
	public String home() {

		System.out.println("페이지 출력");
		return "pub/NewFile";

	}
}