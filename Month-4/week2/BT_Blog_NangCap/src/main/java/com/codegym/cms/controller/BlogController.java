package com.codegym.cms.controller;
import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.BlogService;
import com.codegym.cms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping(produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("blogs/list");
        Iterable<Blog> blogs = blogService.findAll();
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping(value = "{id}", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("blogs/info");
        Blog blogs = blogService.findById(id);
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView updateCustomer(@ModelAttribute("blogs") Blog blogs) {
        blogService.save(blogs);
        ModelAndView modelAndView = new ModelAndView("/blogs/info");
        modelAndView.addObject("blogs", blogs);
        modelAndView.addObject("message", "blog updated successfully");
        return modelAndView;
    }

//    @PostMapping(value = "/edit-customer", produces = "application/x-www-form-urlencoded;charset=UTF-8")
//    public String updateCustomer(Customer customer) {
//        customerService.save(customer);
//        return "redirect:/customers";
//    }

    @GetMapping(value = "/create", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView = new ModelAndView("blogs/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping(value = "/save", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String saveCustomer(Blog blogs) {
        blogService.save(blogs);
        return "redirect:/blogs";
    }

    @GetMapping(value = "/delete/{id}", produces = "application/x-www-form-urlencoded;charset=UTF-8")
    public String delete(@PathVariable Long id) {
        blogService.remove(id);
        return "redirect:/blogs";
    }
    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }
}

