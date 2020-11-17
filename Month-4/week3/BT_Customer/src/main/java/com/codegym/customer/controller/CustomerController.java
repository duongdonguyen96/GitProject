package com.codegym.customer.controller;

import com.codegym.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public String index() {
        return "customer";
    }
}
