package com.example.demo.service.impl;

import com.example.demo.model.Telivisions;
import com.example.demo.repository.TelivisionRepository;
import com.example.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelivisionService implements BaseService<Telivisions> {
    @Autowired
    TelivisionRepository telivisionRepository;

    @Override
    public List<Telivisions> findAll() {
        return telivisionRepository.findAll();
    }

    @Override
    public Telivisions save(Telivisions blog) {
        return telivisionRepository.save(blog);
    }

    @Override
    public Telivisions findById(long id) {
        return telivisionRepository.findById(id).orElse(null);
    }

    @Override
    public Telivisions remove(long id) {
        Telivisions tv = findById(id);
        telivisionRepository.deleteById(id);
        return tv;
    }
}
