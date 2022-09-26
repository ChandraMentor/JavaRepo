package com.orm.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.orm.hlo.StudentHLO;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public StudentDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insert(StudentHLO student) {
		hibernateTemplate.save(student);
	}

	public StudentHLO findStudent(int id) {
		return hibernateTemplate.get(StudentHLO.class, id);
	}

}
