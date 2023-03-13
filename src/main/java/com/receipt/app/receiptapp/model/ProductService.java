package com.receipt.app.receiptapp.model;

import com.receipt.app.receiptapp.dao.ProductsDaoImpl;
import com.receipt.app.receiptapp.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
public class ProductService {
    @Autowired
    private ProductsDaoImpl productsDaoImpl;

    public ProductService() {
    }

    public Product findProduct(int id){
        return productsDaoImpl.findProductById(id);
    }

    public void saveProduct(Product product){
        productsDaoImpl.saveProduct(product);
    }

    public void deleteProduct(Product product){
        productsDaoImpl.deleteProduct(product);
    }
    public void updateProduct(Product product){
        productsDaoImpl.updateProduct(product);
    }
    public void readProduct(int id){
        productsDaoImpl.readProduct(id);
    }

    public void productToListAndGetPrice(int id, int quantity){
        productsDaoImpl.productToListAndGetPrice(id, quantity);
    }

}
