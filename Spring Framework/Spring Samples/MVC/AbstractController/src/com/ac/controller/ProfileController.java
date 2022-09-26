package com.ac.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ac.beans.Profile;

public class ProfileController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = null;
		String id = request.getParameter("id");
		// connect to db
		Profile profile = new Profile();
		profile.setId(Integer.parseInt(id));
		profile.setName("John");
		profile.setEmail("John@gmail.com");

		mav = new ModelAndView();
		mav.addObject("profile", profile);
		mav.setViewName("profile");
		return mav;
	}

}
