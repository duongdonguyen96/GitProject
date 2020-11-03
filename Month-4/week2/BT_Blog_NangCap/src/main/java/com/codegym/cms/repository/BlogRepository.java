package com.codegym.cms.repository;
import com.codegym.cms.model.Blog;

import com.codegym.cms.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category blog);
    Page<Blog> findAllByTitle(String name,Pageable pageable);

}
