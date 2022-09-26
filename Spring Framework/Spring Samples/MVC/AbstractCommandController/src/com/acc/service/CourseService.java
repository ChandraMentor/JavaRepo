package com.acc.service;

import com.acc.beans.CourseInfo;
import com.acc.command.SearchCommand;

public interface CourseService {
	CourseInfo getCourseDetails(SearchCommand search);
}
