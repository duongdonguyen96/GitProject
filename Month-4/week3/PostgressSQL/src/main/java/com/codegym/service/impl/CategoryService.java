package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.repository.BlogRepository;
import com.codegym.repository.CategoryRepository;
import com.codegym.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements BaseService<Category> {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category remove(int id) {
        Category category = findById(id);
        categoryRepository.deleteById(id);
        return category;
    }

}
