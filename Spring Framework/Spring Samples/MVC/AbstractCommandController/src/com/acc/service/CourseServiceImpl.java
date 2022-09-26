package com.acc.service;

import com.acc.beans.CourseInfo;
import com.acc.command.SearchCommand;
import com.acc.dao.CourseDao;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao;

	@Override
	public CourseInfo getCourseDetails(SearchCommand search) {
		return courseDao.findCourse(search);
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

}
