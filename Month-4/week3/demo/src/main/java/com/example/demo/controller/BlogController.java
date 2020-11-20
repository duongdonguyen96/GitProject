package com.example.demo.controller;


import com.example.demo.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/blog")
    public String index() {
        return "blog";
    }

}
