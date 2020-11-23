package com.example.demo.controller;

import com.example.demo.service.impl.TelivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TelivisionController {
    @Autowired
    TelivisionService telivisionService;
    @GetMapping("/tv")
    public String index() {
        return "telivision";
    }

}
