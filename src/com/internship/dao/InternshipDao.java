package com.internship.dao;

import com.internship.model.Internship;

public interface InternshipDao {
    Internship searchById(Integer id);

    Internship save(Internship internship);

    void remove(Integer id);
}
