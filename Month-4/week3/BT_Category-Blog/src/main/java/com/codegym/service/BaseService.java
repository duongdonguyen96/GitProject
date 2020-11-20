package com.codegym.service;

import java.sql.SQLException;
import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T save(T object) ;
    T findById(int id);
    T remove(int id) ;

}
