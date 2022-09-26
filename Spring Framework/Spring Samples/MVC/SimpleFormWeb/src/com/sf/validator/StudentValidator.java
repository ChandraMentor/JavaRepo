package com.sf.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sf.command.StudentCommand;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		if (classType.isAssignableFrom(StudentCommand.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object command, Errors errors) {
		StudentCommand sc = (StudentCommand) command;

		if (sc.getStudentId() <= 0) {
			errors.reject("student.id.invalid");
		}

		if (sc.getName() == null || sc.getName().equals("")) {
			errors.reject("student.name.blank");
		}
	}

}
