package com.internship.service.impl;

import com.internship.dao.InternshipDao;
import com.internship.model.Internship;
import com.internship.model.Student;
import com.internship.service.InternshipService;

import java.util.List;

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

    @Override
    public void addStudents(Integer internshipId, List<Student> students) {
        Internship internship = internshipDao.searchById(internshipId);
        internship.addStudentsByKnowledge(students);
    }
}
