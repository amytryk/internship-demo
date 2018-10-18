package com.internship.service.impl;

import com.internship.dao.UniversityDao;
import com.internship.model.Student;
import com.internship.model.University;
import com.internship.service.UniversityService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<University> getUniversities() {
        return universityDao.getAllUniversities();
    }

    @Override
    public void addStudent(Integer universityId, Student student) {
        University university = universityDao.searchById(universityId);
        university.addStudent(student);
    }

    @Override
    public void addStudents(Integer universityId, List<Student> students) {
        University university = universityDao.searchById(universityId);
        university.addAllStudents(students);
    }

    @Override
    public List<Student> getStudents(Integer universityId) {

        University university = universityDao.searchById(universityId);

        return university.getStudents();
    }

    @Override
    public List<Student> getStudentsByKnowledge(Integer universityId, int knowledgeThreshold) {

        University university = universityDao.searchById(universityId);
        List<Student> students = new ArrayList<>();

        for (Student student : university.getStudents()) {

            if (student.getKnowledge().getLevel() >= knowledgeThreshold) {
                students.add(student);
            }
        }

        return students;
    }
}
