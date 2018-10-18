package com.internship.dao;

import com.internship.model.Knowledge;

public interface KnowledgeDao {
    Knowledge searchById(Integer id);

    Knowledge save(Knowledge knowledge);

    void remove(Integer id);

}
