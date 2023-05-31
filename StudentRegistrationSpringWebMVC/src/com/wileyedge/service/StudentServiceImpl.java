package com.wileyedge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wileyedge.dao.StudentDao;
import com.wileyedge.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(Student student) {
        try {
			studentDao.saveStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

