package com.receipt.app.receiptapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(generator = "product_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "product_seq", sequenceName = "product_sequence", initialValue = 1)
    private Integer id;
    private String product;
    private int price;
    public double total;

    public Product() {
    }

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
