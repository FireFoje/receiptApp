package com.receipt.app.receiptapp.dao;
import com.receipt.app.receiptapp.entity.Product;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addClass(Product.class)
            .buildSessionFactory();;
    private HibernateSessionFactoryUtil(){}

    public static SessionFactory getSessionFactory(){
            try{
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Product.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
            }catch (Exception e){
                System.out.println("Исключение: " + e);
            }
        return sessionFactory;
    }
}
