package com.internship.service;

import com.internship.model.Internship;
import com.internship.model.Student;

import java.util.List;

public interface InternshipService {

    Internship getById(Integer id);

    Internship add(Internship internship);

    void addStudents(Integer internshipId, List<Student> students);

    List<Student> getAllStudents(Integer internshipId);
}
