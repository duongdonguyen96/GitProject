package dao;

import java.util.List;


public interface BaseDAO<T> {

    List<T> getAll() throws Exception;

    void save(T object) throws Exception;

    boolean update(T object) throws Exception;

    boolean delete(int id) throws Exception;

    T findById(int id) throws Exception;


}
