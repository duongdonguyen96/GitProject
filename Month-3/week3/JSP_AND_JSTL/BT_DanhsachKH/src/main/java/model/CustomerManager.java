package model;

import java.util.ArrayList;

public class CustomerManager {
    public static ArrayList<Customer> customersList = new ArrayList<>();

    static {
        Customer cus1 = new Customer("Tin", "25/1/1995", "Huong Chu", "tin.jpg");
        Customer cus2 = new Customer("Long", "25/7/1995", "Phu Vang", "Long.jpg");
        Customer cus3 = new Customer("HiepLe", "25/5/1994", "Phu le", "hiep.jpg");

        customersList.add(cus1);
        customersList.add(cus2);
        customersList.add(cus3);
    }
}
