package com.wileyedge.dao;

import org.springframework.stereotype.Repository;

import com.wileyedge.model.Student;

@Repository
public interface StudentDao {
	void saveStudent(Student student) throws Exception;
}
