package service;

import model.Miss;

import java.util.List;

public interface MissService {

    List<Miss> findAll();

    void save(Miss miss);

    Miss findById(int id);

    void update(int id, Miss miss);

    void remove(int id);

    List<Miss> checkStatusList();
}
