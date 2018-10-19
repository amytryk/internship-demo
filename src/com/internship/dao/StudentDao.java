package com.internship.dao;

import com.internship.model.Student;

import java.util.List;

public interface StudentDao {
    Student search(Integer id);

    Student save(Student student);

    void remove(Integer id);

    List<Student> getAllStudents();

}
