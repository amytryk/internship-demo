package com.internship.service;

import com.internship.model.Internship;

public interface InternshipService {

    Internship getById(Integer id);

    Internship add(Internship internship);
}
