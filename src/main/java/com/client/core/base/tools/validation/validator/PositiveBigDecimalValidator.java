package com.client.core.base.tools.validation.validator;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.client.core.base.tools.validation.Positive;

public class PositiveBigDecimalValidator implements ConstraintValidator<Positive, BigDecimal> {

	@Override
	public void initialize(Positive constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
		if(value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
			return false;
		}
		
		return true;
	}

}
