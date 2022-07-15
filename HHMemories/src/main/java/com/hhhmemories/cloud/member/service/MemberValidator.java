package com.hhhmemories.cloud.member.service;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberVO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberVO memberVo = (MemberVO)target;
		
		//투입 시작일 필수
		if(!errors.hasErrors()) if(memberVo.getMemberNm().length() == 0)
				errors.rejectValue("memberNm", ";");

	}

}
