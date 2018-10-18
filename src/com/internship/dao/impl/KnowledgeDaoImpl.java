package com.internship.dao.impl;

import com.internship.dao.KnowledgeDao;
import com.internship.model.Knowledge;

import java.util.HashMap;
import java.util.Map;

public class KnowledgeDaoImpl implements KnowledgeDao {

    Map<Integer, Knowledge> knowledgeMap = new HashMap<>();

    @Override
    public Knowledge searchById(Integer id) {
        return knowledgeMap.get(id);
    }

    @Override
    public Knowledge save(Knowledge knowledge) {
        return knowledgeMap.put(knowledge.getId(), knowledge);
    }

    @Override
    public void remove(Integer id) {
        knowledgeMap.remove(id);
    }
}
