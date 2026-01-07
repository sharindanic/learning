package com.telusko.simplewebappp.service;
import com.telusko.simplewebappp.model.Product;

import com.telusko.simplewebappp.repositorie.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    productRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList
//            (new Product(101, "Iphone", 5000)
//                    , new Product(102, "Samsung", 3000)
//                    , new Product(103, "Pixel", 6000)));

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());

    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
        }
    }
