package com.receipt.app.receiptapp.model;

import com.receipt.app.receiptapp.dao.HibernateSessionFactoryUtil;
import com.receipt.app.receiptapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double total = 0;
    List<List<Product>> productList = new ArrayList<>();

    public void addToCart(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        productList.add(session.createQuery("select price from Product where id = " + id, Product.class).stream().toList());
    }

    public void displayCart(){
        for(List<Product> p : productList){
            System.out.println(p);
        }

        System.out.println("Total is: " + total);
    }
}
