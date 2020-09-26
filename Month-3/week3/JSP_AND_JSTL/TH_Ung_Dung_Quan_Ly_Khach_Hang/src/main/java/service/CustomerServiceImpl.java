package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    public static Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "Tin", "chanhtin@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Huong", "thanhhuong@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3, "Long", "long6mui@codegym.vn", "QuangTri"));
        customerMap.put(4, new Customer(4, "Nguyen", "nguyenoccho@codegym.vn", "MyTHo"));
        customerMap.put(5, new Customer(5, "Phuc", "DotanFuck@codegym.vn", "SG"));
        customerMap.put(6, new Customer(6, "Hiep", "Hieple@codegym.vn", "Hue"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);

    }
}
