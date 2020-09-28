package service;

import model.Customer;

import java.util.*;

public class CustomerService {
    public static Map<Integer, Customer> lisCustomer = new HashMap<>();

    static {
//        Customer cus1 = new Customer(1, "dotanphuc", "0000000000", "dotanphuc@gmail.com");
//        Customer cus2 = new Customer(2, "dochanhtin", "1111111111", "dochanhtin@gmail.com");
//        Customer cus3 = new Customer(3, "tranthivolong", "2222222222", "tranthivolong@gmail.com");
//        Customer cus4 = new Customer(4, "tranthihuong", "3333333333", "tranthihuong@gmail.com");
//        Customer cus5 = new Customer(5, "lethihiep", "4444444444", "LeThiHiep@gmail.com");
//        Customer cus6 = new Customer(6, "duongdonguyen", "5555555555", "duongdonguyen96@gmail.com");
//
//        lisCustomer.put(cus1.getId(), cus1);
//        lisCustomer.put(cus2.getId(), cus2);
//        lisCustomer.put(cus3.getId(), cus3);
//        lisCustomer.put(cus4.getId(), cus4);
//        lisCustomer.put(cus5.getId(), cus5);
//        lisCustomer.put(cus6.getId(), cus6);
    }

    public Customer getById(int id) {
        Customer customer = lisCustomer.get(id);
        return customer;
    }

    //this funtion will take information of Customer
    public Customer getCustomer(int id) {
        return lisCustomer.get(id);
    }


    //this funtion will add Customer
    public void addCustomer(Customer customer) {

        lisCustomer.put(customer.getId(), customer);
    }


    //this funtion will update information Customer

    public void updateCustomer(Customer customer) {
        lisCustomer.replace(customer.getId(), customer);
    }


    //this funtion will delete Customer
    public void deleteCustomer(int id) {
        lisCustomer.remove(id);
    }

    //get All Customer

    public static List<Customer> gettAllCustomer() {
        Collection<Customer> cus = lisCustomer.values();
        List<Customer> list = new ArrayList<>();
        list.addAll(list);
        return list;


    }


}








