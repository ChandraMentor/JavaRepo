package com.javatpoint;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
public class EmpDao {
SimpleJdbcTemplate template;

public EmpDao(SimpleJdbcTemplate template) {
		this.template = template;
}
public int update (Emp e){
String query="update employee set name=? where id=?";
return template.update(query,e.getName(),e.getId());

//String query="update employee set name=?,salary=? where id=?";
//return template.update(query,e.getName(),e.getSalary(),e.getId());
}

}
