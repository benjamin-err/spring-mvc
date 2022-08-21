package com.spring.mvc.demo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =  CourseCodeConstraintValidatior.class )
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	
	// default course code
	public String value() default "LUV";
	
	// default error message
	 public String message() default "has to start with LUV";
	 
	 // default groups
	 public Class<?>[] groups() default {};
	 
	 // default payloads
	 public Class<? extends Payload> [] payload() default {};
	

}
