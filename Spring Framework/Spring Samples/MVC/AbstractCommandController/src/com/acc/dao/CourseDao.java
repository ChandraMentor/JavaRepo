package com.acc.dao;

import com.acc.beans.CourseInfo;
import com.acc.command.SearchCommand;

public interface CourseDao {
	CourseInfo findCourse(SearchCommand search);
}
