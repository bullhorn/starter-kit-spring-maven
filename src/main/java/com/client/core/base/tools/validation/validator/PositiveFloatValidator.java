package com.client.core.base.tools.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.client.core.base.tools.validation.Positive;

public class PositiveFloatValidator implements ConstraintValidator<Positive, Float> {

	@Override
	public void initialize(Positive constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(Float value, ConstraintValidatorContext context) {
		if(value == null || value <= 0) {
			return false;
		}
		
		return true;
	}

}
