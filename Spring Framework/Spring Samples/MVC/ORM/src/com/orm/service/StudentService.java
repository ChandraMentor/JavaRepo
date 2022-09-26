package com.orm.service;

import com.orm.beans.StudentInfo;
import com.orm.dao.StudentDao;
import com.orm.hlo.StudentHLO;

public class StudentService {
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void insert(StudentInfo student) {
		StudentHLO studentHLO = new StudentHLO();
		studentHLO.setId(student.getId());
		studentHLO.setName(student.getName());
		studentDao.insert(studentHLO);
	}

	public StudentInfo findStudent(int id) {
		StudentHLO studentHLO = studentDao.findStudent(id);
		StudentInfo student = new StudentInfo();
		student.setId(studentHLO.getId());
		student.setName(studentHLO.getName());
		return student;
	}
}
