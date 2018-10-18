package com.internship.service;

import com.internship.model.Student;

public interface StudentService {

    Student getById(Integer id);

    Student add(Student student);

}
