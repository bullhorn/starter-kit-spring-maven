package com.client.core.base.tools.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.client.core.base.tools.validation.validator.PositiveBigDecimalValidator;
import com.client.core.base.tools.validation.validator.PositiveDoubleValidator;
import com.client.core.base.tools.validation.validator.PositiveIntegerValidator;
import com.client.core.base.tools.validation.validator.PositiveLongValidator;
import com.client.core.base.tools.validation.validator.PositiveFloatValidator;

@Target( {METHOD, FIELD} )
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {PositiveIntegerValidator.class, PositiveBigDecimalValidator.class,
		PositiveFloatValidator.class, PositiveDoubleValidator.class, PositiveLongValidator.class} )
public @interface Positive {

	String message() default "{generic.custom.positive}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
	
}
