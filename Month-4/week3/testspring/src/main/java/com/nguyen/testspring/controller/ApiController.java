package com.nguyen.testspring.controller;

import com.nguyen.testspring.model.Type;
import com.nguyen.testspring.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    TypeService typeService;

    @GetMapping("/allType")
    public List<Type> getAll(){
        List<Type> types = typeService.findAll();
        return types;
    }


}
