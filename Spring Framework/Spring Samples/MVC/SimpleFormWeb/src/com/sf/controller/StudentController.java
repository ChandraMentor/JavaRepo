package com.sf.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sf.command.StudentCommand;

public class StudentController extends SimpleFormController {

	public StudentController() {
		setCommandClass(StudentCommand.class);
		setCommandName("student");
		setSessionForm(true);
	}

	@Override
	protected ModelAndView onSubmit(Object command, BindException errors)
			throws Exception {
		ModelAndView mav = null;
		StudentCommand sc = (StudentCommand) command;

		mav = new ModelAndView();
		mav.addObject("id", sc.getStudentId());
		mav.setViewName("completed");

		return mav;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");
		StudentCommand command = new StudentCommand();
		command.setStudentId(Integer.parseInt(id));
		command.setName("suresh");

		return command;
	}

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map dataMap = new HashMap();

		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Spring");

		dataMap.put("courses", courses);

		return dataMap;
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		BindException be = getErrorsForNewForm(request);
		be.reject("duplicate.submit");

		return showForm(request, response, be);
	}

}
