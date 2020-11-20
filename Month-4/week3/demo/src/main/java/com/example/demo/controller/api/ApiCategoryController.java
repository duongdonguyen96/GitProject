package com.example.demo.controller.api;

import com.example.demo.model.Category;
import com.example.demo.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ApiCategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/category/", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> listAllCustomers() {
        List<Category> allCategory = categoryService.findAll();
        if (allCategory == null) {
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Category>>(allCategory, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Category> delete(@PathVariable("id") int id) {
        Category category = categoryService.remove(id);
        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }

    @RequestMapping(value = "category/", method = RequestMethod.POST)

    public ResponseEntity<Category> create(@RequestBody Category blog) {
        Category createCategory = categoryService.save(blog);
        return new ResponseEntity<Category>(createCategory, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public ResponseEntity<Category> getByID(@PathVariable("id") int id) {

        Category editBlogs = categoryService.findById(id);
        return new ResponseEntity<Category>(editBlogs, HttpStatus.OK);
    }

    @RequestMapping(value = "/category/", method = RequestMethod.PUT)
    public ResponseEntity<Category> update(@RequestBody Category customer) {
        categoryService.save(customer);
        return new ResponseEntity<Category>(customer, HttpStatus.OK);
    }
}

