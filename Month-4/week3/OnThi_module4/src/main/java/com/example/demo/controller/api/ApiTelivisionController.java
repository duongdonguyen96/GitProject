package com.example.demo.controller.api;

import com.example.demo.model.Telivisions;
import com.example.demo.service.impl.TelivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiTelivisionController {
    @Autowired
    TelivisionService telivisionService;
    @RequestMapping(value = "/tv/", method = RequestMethod.GET)
    public ResponseEntity<List<Telivisions>> listAllCustomers() {
        List<Telivisions> allTV = telivisionService.findAll();
        if (allTV == null) {
            return new ResponseEntity<List<Telivisions>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Telivisions>>(allTV, HttpStatus.OK);
    }

    @RequestMapping(value = "/tv/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Telivisions> delete(@PathVariable("id") int id) {
        Telivisions tv = telivisionService.remove(id);
        return new ResponseEntity<Telivisions>(tv, HttpStatus.OK);
    }

    @RequestMapping(value = "tv/", method = RequestMethod.POST)

    public ResponseEntity<Telivisions> create(@RequestBody Telivisions blog) {
        Telivisions createTV = telivisionService.save(blog);
        return new ResponseEntity<Telivisions>(createTV, HttpStatus.OK);
    }

    @RequestMapping(value = "/tv/{id}", method = RequestMethod.GET)
    public ResponseEntity<Telivisions> getSmartphone(@PathVariable("id") int id) {

        Telivisions editTV = telivisionService.findById(id);
        return new ResponseEntity<Telivisions>(editTV, HttpStatus.OK);
    }

    @RequestMapping(value = "/tv/", method = RequestMethod.PUT)
    public ResponseEntity<Telivisions> update(@RequestBody Telivisions blog) {
        telivisionService.save(blog);
        return new ResponseEntity<Telivisions>(blog, HttpStatus.OK);
    }
}
