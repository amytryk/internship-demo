package com.internship.model;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private int id;
    private String name;
    private List<Student> students = new ArrayList<>();

    public Internship(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {

        if (students != null) {
            this.students = students;
        }
    }

    public void addStudentsByKnowledge(List<Student> students) {
        this.students.addAll(students);
    }

    @Override
    public String toString() {
        return "Internship id " + id +
                "; name " + name +
                ": students " + students ;
    }
}
