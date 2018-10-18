package com.internship.dao;

import com.internship.model.Student;

public interface StudentDao {
    Student search(Integer id);

    Student save(Student student);

    void remove(Integer id);
}
