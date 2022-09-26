package com.acc.beans;

import java.io.Serializable;

public class CourseInfo implements Serializable {
	private int courseId;
	private String name;

	public CourseInfo(int courseId, String name) {
		this.courseId = courseId;
		this.name = name;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
