package com.hhhmemories.cloud.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

	private static final Logger logger = LoggerFactory.getLogger(MemberValidator.class);
	
	@Override
	public boolean supports(Class<?> clazz) {
		return MemberVO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		if(logger.isDebugEnabled())
			logger.debug("validate start.");

		MemberVO memberVo = (MemberVO)target;
		
	}

}
