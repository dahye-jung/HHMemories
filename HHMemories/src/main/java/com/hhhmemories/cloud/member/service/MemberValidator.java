package com.hhhmemories.cloud.member.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberVO.class.equals(clazz);
	}
	
	private Pattern pattern;

	@Override
	public void validate(Object obj, Errors err) {

		MemberVO mem = (MemberVO)obj;
		
	}

}
