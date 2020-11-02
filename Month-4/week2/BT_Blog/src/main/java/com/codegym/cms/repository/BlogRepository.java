package com.codegym.cms.repository;
import com.codegym.cms.model.Blog;
import java.util.List;
public interface BlogRepository {
        List<Blog> findAll();
        Blog findById(Long id);
        void save(Blog model);
        void remove(Long id);
}
