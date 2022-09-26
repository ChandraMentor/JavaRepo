package com.acc.command;

import java.io.Serializable;

public class SearchCommand implements Serializable {
	private int courseId;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

}
