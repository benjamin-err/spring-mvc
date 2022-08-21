package com.spring.mvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidatior implements ConstraintValidator<CourseCode, String> {

	private String prefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		prefix = constraintAnnotation.value();
	}

	/*
	 * arg0 -> data that the user entered in their html form atg1 -> additional
	 * error messages if we want to add
	 */
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean valid = false;
		
		if (arg0 != null)
			return arg0.startsWith(prefix);
		
		return valid;
	}

}
