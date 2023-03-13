package com.receipt.app.receiptapp.dao;

import com.receipt.app.receiptapp.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.results.jdbc.internal.ResultSetAccess;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductsDaoImpl implements ProductsDao{
    @Override
    public Product findProductById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Product.class, id);
    }

    @Override
    public void deleteProduct(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product);
    }

    @Override
    public void saveProduct(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateProduct(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    public void readProduct(int id){
        SessionFactory sf = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session = sf.openSession();
        session.beginTransaction();
        session.get(Product.class, id);
        session.close();
    }

    public void productToListAndGetPrice(int id, int quantity) {

        List<Product> productList = new ArrayList<>();
        List<Product> productPriceList = new ArrayList<>();
        List<Product> productNameList = new ArrayList<>();
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        productList = session.createQuery("select * from Product where id = " + id, Product.class).stream().toList();
        productPriceList = session.createQuery("select price from Product where id = " + id, Product.class).stream().toList();
        productNameList = session.createQuery("select product from Product where id = " + id, Product.class).stream().toList();
        if (productPriceList.size() > 0){
            int sum = 0;
            sum += Integer.parseInt(String.valueOf(productPriceList.get(0))) * quantity;
            System.out.println(productList);
//            System.out.println(String.format("=========================================="));
//            System.out.printf(String.format("%8s%8s%8s%8s%8s%n", "ProdId", "Product", "Quan", "Price", "Total"));
//            System.out.printf(String.format("%8s%8s%8s%8s%8s%n", id, productNameList.get(0), quantity, productPriceList.get(0), sum));
//            System.out.println(String.format("=========================================="));
        }
    }
}
