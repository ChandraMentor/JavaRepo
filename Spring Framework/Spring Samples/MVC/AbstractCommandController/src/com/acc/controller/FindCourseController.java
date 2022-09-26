package com.acc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.acc.beans.CourseInfo;
import com.acc.command.SearchCommand;
import com.acc.service.CourseService;

public class FindCourseController extends AbstractCommandController {
	private CourseService courseService;

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object obj, BindException be)
			throws Exception {
		ModelAndView mav = null;
		SearchCommand command = (SearchCommand) obj;

		CourseInfo courseInfo = courseService.getCourseDetails(command);
		mav = new ModelAndView();
		mav.addObject("courseDetail", courseInfo);
		mav.setViewName("courseDetails");

		return mav;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

}
