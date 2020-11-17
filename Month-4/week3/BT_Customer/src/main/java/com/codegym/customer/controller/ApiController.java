package com.codegym.customer.controller;


import com.codegym.customer.model.Customer;
import com.codegym.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/customer/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllCustomers() {
        List<Customer> allCustomers = customerService.findAll();
        if (allCustomers == null) {
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Customer>>(allCustomers, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> delete(@PathVariable("id") int id) {
        Customer customer = customerService.remove(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/", method = RequestMethod.POST)
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer customerCreate = customerService.save(customer);

        return new ResponseEntity<Customer>(customerCreate, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getSmartphone(@PathVariable("id") int id) {

        Customer editPhone = customerService.findById(id);
        return new ResponseEntity<Customer>(editPhone, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/", method = RequestMethod.PUT)
    public ResponseEntity<Customer> update(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}
