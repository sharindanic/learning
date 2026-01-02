package com.telusko.simplewebappp.service;
import com.telusko.simplewebappp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList
            (new Product(101, "Iphone", 5000)
                    , new Product(102, "Samsung", 3000)
                    , new Product(103, "Pixel", 6000)));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(null);

    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;

        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;

        products.set(index, prod);
    }


    public void deleteProduct(int prodId) {
        int index = -1;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            products.remove(index);
        }
    }
}
