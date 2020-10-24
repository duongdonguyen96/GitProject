package com.codegym.service;

import com.codegym.model.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {


    private static final Map<Integer, Products> productsList;

    static {

        productsList = new HashMap<>();
        productsList.put(1, new Products(1, "ti vi", 100, 1, "VN"));
        productsList.put(2, new Products(2, "tu lanh", 100, 1, "TAU KHUA"));
        productsList.put(3, new Products(3, "may quat", 100, 1, "HAN XENG"));
        productsList.put(4, new Products(4, "laptop", 100, 1, "THAI DUI"));
        productsList.put(5, new Products(5, "Xe may", 100, 1, "DONG LAO"));
        productsList.put(6, new Products(6, "Xe dap", 100, 1, "BDN"));
    }

    @Override
    public List findAll() {
        return new ArrayList<>(productsList.values());
    }

    @Override
    public void save(Products product) {
        productsList.put(product.getId(), product);

    }

    @Override
    public Products findById(int id) {
        return productsList.get(id);
    }

    @Override
    public void update(int id, Products product) {
        productsList.put(id, product);
    }

    @Override
    public void remove(int id) {
        productsList.remove(id);
    }

}


