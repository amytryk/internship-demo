package com.internship.service.impl;

import com.internship.dao.StudentDao;
import com.internship.model.Student;
import com.internship.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student getById(Integer id) {
        return studentDao.search(id);
    }

    @Override
    public Student add(Student student) {
        return studentDao.save(student);
    }
}
