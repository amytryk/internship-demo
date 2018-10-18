package com.internship.dao.impl;

import com.internship.dao.InternshipDao;
import com.internship.model.Internship;

import java.util.HashMap;
import java.util.Map;

public class InternshipDaoImpl implements InternshipDao {

    Map<Integer, Internship> internshipMap = new HashMap<>();

    @Override
    public Internship searchById(Integer id) {
        return internshipMap.get(id);
    }

    @Override
    public Internship save(Internship internship) {
        return internshipMap.put(internship.getId(), internship);
    }

    @Override
    public void remove(Integer id) {
        internshipMap.remove(id);
    }
}
