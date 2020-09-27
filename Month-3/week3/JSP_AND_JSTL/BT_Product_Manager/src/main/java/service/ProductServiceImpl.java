package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static final Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "Laptop", "100", "Hang xin", "VN"));
        productMap.put(2, new Product(2, "Mouse", "10", "Hang nhai", "CHINA"));
        productMap.put(3, new Product(3, "Tivi SamSung", "1000", "Hang xin", "VN"));
        productMap.put(4, new Product(4, "Iphone100", "100000", "Hang xin", "VN"));
        productMap.put(5, new Product(5, "IphoneTauKhua", "1", "Hang sida", "China"));
        productMap.put(6, new Product(6, "Car", "100000", "Hang xin", "USA"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(product.getId(), product);

    }

    @Override
    public void remove(int id) {
        productMap.remove(id);

    }
}
