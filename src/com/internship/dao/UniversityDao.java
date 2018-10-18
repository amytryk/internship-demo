package com.internship.dao;

import com.internship.model.University;

public interface UniversityDao {
    University search(Integer id);

    University save(University university);

    void remove(Integer id);
}