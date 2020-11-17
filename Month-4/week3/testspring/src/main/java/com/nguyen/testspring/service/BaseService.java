package com.nguyen.testspring.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
     void save(T object);
     T findById(int id);


}
