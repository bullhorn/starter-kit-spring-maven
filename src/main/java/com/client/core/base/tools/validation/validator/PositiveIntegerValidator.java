package com.client.core.base.tools.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.client.core.base.tools.validation.Positive;

public class PositiveIntegerValidator implements ConstraintValidator<Positive, Integer> {

	@Override
	public void initialize(Positive constrSaintAnnotation) {
		
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value == null || value <= 0) {
			return false;
		}
		
		return true;
	}

}
