package com.telusko.simplewebappp.repositorie;

import com.telusko.simplewebappp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<Product,Integer> {

}
