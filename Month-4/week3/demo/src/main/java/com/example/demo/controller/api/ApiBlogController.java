package com.example.demo.controller.api;

import com.example.demo.model.Blog;
import com.example.demo.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ApiBlogController {
    @Autowired
    BlogService blogService;
    @RequestMapping(value = "/blog/", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> listAllCustomers() {
        List<Blog> allBlogs = blogService.findAll();
        if (allBlogs == null) {
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Blog>>(allBlogs, HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Blog> delete(@PathVariable("id") int id) {
        Blog blog = blogService.remove(id);
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @RequestMapping(value = "blog/", method = RequestMethod.POST)

        public ResponseEntity<Blog> create(@RequestBody Blog blog) {
            Blog createBlog = blogService.save(blog);
            return new ResponseEntity<Blog>(createBlog, HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
    public ResponseEntity<Blog> getSmartphone(@PathVariable("id") int id) {

        Blog editBlogs = blogService.findById(id);
        return new ResponseEntity<Blog>(editBlogs, HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/", method = RequestMethod.PUT)
    public ResponseEntity<Blog> update(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }
}
