package com.internship.dao.impl;

import com.internship.dao.StudentDao;
import com.internship.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {

    Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public Student search(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public Student save(Student student) {
        return studentMap.put(student.getId(), student);
    }

    @Override
    public void remove(Integer id) {
        studentMap.remove(id);
    }
}
