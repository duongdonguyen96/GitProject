package com.codegym.controller;

import com.codegym.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/category")
    public String index() {
        return "category";
    }
}
