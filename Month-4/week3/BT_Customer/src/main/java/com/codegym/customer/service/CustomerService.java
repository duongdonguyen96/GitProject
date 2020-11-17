package com.codegym.customer.service;

import com.codegym.customer.model.Customer;
import com.codegym.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements BaseService<Customer>{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
       return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer remove(int id) {
        Customer customer = findById(id);
        customerRepository.deleteById(id);
        return customer;
    }
}
