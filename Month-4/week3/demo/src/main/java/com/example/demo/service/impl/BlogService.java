package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements BaseService<Blog> {
    @Autowired
    BlogRepository blogRepository;

    @Autowired
    CategoryService categoryService;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog remove(int id) {
        Blog blog = findById(id);
        blogRepository.deleteById(id);
        return blog;
    }

}
