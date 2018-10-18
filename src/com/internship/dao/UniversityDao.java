package com.internship.dao;

import com.internship.model.University;

import java.util.List;

public interface UniversityDao {
    University searchById(Integer id);

    University save(University university);

    void remove(Integer id);

    List<University> getAllUniversities();
}
