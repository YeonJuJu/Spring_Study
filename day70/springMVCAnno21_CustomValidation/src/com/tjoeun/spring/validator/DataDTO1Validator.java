package com.tjoeun.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tjoeun.spring.bean.DataDTO1;

public class DataDTO1Validator implements Validator{
	
	//해당 클래스가 유효성 검사가 가능한 클래스인지 판단
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return DataDTO1.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 값이 비어있는지 체크함 (공백도 문자로 인식) .rejectInEmpty(errors, property이름, code이름)
		ValidationUtils.rejectIfEmpty(errors, "addr", "err1");
		
		// 값이 비어있는지 체크함 (공백은 문자로 인식하지 않음)
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "err2");
		
		DataDTO1 dto1 = (DataDTO1)target;
		String addr = dto1.getAddr();
		String email = dto1.getEmail();
		
		if(addr.length() > 10) {
			errors.rejectValue("addr", "errAddrLength");
		}
		if(email.contains("@") == false) {
			errors.rejectValue("email", "emailContainsAtsign");
		}

	}

}
