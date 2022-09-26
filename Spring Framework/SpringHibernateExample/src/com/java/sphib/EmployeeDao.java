package com.java.sphib;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao
{
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
	this.template = template;
	}

	public void saveEmployee(Employee e){
	template.save(e);
	}

	public void updateEmployee(Employee e){
	template.update(e);
		}

	public void deleteEmployee(Employee e){
	template.delete(e);
	}
}