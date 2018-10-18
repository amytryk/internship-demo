package com.internship.service.impl;

import com.internship.dao.UniversityDao;
import com.internship.model.University;
import com.internship.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

    private UniversityDao universityDao;

    public UniversityServiceImpl(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }

    @Override
    public University getById(Integer id) {
        return universityDao.searchById(id);
    }

    @Override
    public University add(University university) {
        return universityDao.save(university);
    }
}
