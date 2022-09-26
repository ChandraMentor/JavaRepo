package com.acc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.acc.beans.CourseInfo;
import com.acc.command.SearchCommand;

public class CourseDaoImpl implements CourseDao {
	private final String FIND_COURSE_BY_ID = "SELECT COURSE_ID, NAME FROM COURSE WHERE COURSE_ID = ?";
	private JdbcTemplate jdbcTemplate;

	public CourseDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public CourseInfo findCourse(SearchCommand search) {
		return jdbcTemplate.queryForObject(FIND_COURSE_BY_ID,
				new RowMapper<CourseInfo>() {
					@Override
					public CourseInfo mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						return new CourseInfo(rs.getInt("COURSE_ID"), rs
								.getString("NAME"));
					}

				}, new Object[] { search.getCourseId() });
	}

}
