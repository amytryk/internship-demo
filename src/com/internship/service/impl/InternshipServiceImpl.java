package com.internship.service.impl;

import com.internship.dao.InternshipDao;
import com.internship.model.Internship;
import com.internship.service.InternshipService;

public class InternshipServiceImpl implements InternshipService {

    private InternshipDao internshipDao;

    public InternshipServiceImpl(InternshipDao internshipDao) {
        this.internshipDao = internshipDao;
    }

    @Override
    public Internship getById(Integer id) {
        return internshipDao.searchById(id);
    }

    @Override
    public Internship add(Internship internship) {
        return internshipDao.save(internship);
    }
}
