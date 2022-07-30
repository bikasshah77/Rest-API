package com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bean.RegisterBean;

public class UserValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object ob, Errors e) {
		// TODO Auto-generated method stub
		RegisterBean rb=new RegisterBean();
		String pass=rb.getPass();
		String phone=rb.getPhone();
		
		if(pass.length()<8) {
			e.rejectValue(pass, "rb.pass");
		}
		if(phone.length()!=10) {
			e.rejectValue(phone, "rb.phone");
		}
	}

}
