package com.internship.service;

import com.internship.model.Student;
import com.internship.model.University;

import java.util.List;

public interface UniversityService {

    University getById(Integer id);

    University add(University university);

    List<University> getUniversities();

    void addStudent(Integer universityId, Student student);

    void addStudents(Integer universityId, List<Student> students);

    List<Student> getStudents(Integer universityId);

    List<Student> getStudentsByKnowledge(Integer universityId, int knowledgeThreshold);


}
