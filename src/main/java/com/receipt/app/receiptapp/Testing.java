package com.receipt.app.receiptapp;

import com.receipt.app.receiptapp.dao.ProductsDao;
import com.receipt.app.receiptapp.dao.ProductsDaoImpl;
import com.receipt.app.receiptapp.entity.Product;
import com.receipt.app.receiptapp.model.Cart;
import com.receipt.app.receiptapp.model.ProductService;
import com.receipt.app.receiptapp.model.Receipt;

public class Testing {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.productToListAndGetPrice(4, 5);
//        Cart cart = new Cart();
//        cart.addToCart(4);
//        cart.addToCart(1);
//        cart.addToCart(8);
//        cart.addToCart(10);
//        cart.displayCart();
    }
}