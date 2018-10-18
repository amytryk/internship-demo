package com.internship.service;

import com.internship.model.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer id);

    Student add(Student student);

    List<Student> getStudents();

}
