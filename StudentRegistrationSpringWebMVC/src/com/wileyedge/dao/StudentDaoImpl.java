package com.wileyedge.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wileyedge.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveStudent(Student student) {
		String sql = "INSERT INTO student (name, age, mobile, address) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getMobile(), student.getAddress());
	}

}
