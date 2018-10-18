package com.internship.dao.impl;

import com.internship.dao.UniversityDao;
import com.internship.model.University;

import java.util.HashMap;
import java.util.Map;

public class UniversityDaoImpl implements UniversityDao {

    Map<Integer, University> universityMap = new HashMap<>();

    @Override
    public University searchById(Integer id) {
        return universityMap.get(id);
    }

    @Override
    public University save(University university) {
        return universityMap.put(university.getId(), university);
    }

    @Override
    public void remove(Integer id) {
        universityMap.remove(id);
    }
}
