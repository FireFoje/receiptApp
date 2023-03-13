package com.receipt.app.receiptapp.dao;

import com.receipt.app.receiptapp.entity.Product;

public interface ProductsDao {

    public Product findProductById(int id);
    void deleteProduct(Product product);
    public void saveProduct(Product product);
    public void updateProduct(Product product);

    public void productToListAndGetPrice(int id, int quantity);
}
