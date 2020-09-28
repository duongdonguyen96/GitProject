package service;

import model.Miss;
import model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();

    Province findById(Long id);
}
