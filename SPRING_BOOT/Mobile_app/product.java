package com.telusko.simplewebappp.model;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int proId;
    private String proName;
    private int price ;

    public Product() {
    }

    public Product(int proId, String proName, int price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public int getProdId() {
        return proId;
    }

    public void setProdId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProdName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';


    }
}
