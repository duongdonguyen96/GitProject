package com.nguyen.testspring.service;

import com.nguyen.testspring.model.Type;
import com.nguyen.testspring.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService implements BaseService<Type> {
    @Autowired
    TypeRepository typeRepository;

    @Override
    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public void save(Type object) {
        typeRepository.save(object);
    }

    @Override
    public Type findById(int id) {
        return typeRepository.findById(id).orElse(null);
    }
}
