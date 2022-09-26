package com.ew.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ew.beans.StudentInfo;

public class StudentDataDownloadController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<StudentInfo> students = new ArrayList<StudentInfo>();

		students.add(new StudentInfo(1, "Raju"));
		students.add(new StudentInfo(2, "Rama"));

		mav.addObject("students", students);
		mav.setViewName("studentexcel");
		return mav;
	}

}
