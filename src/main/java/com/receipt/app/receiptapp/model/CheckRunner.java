package com.receipt.app.receiptapp.model;

import lombok.Data;

@Data
public class CheckRunner {
    private int itemId;
    private int quantity;
    private int userCard;

    public CheckRunner() {
    }

    public CheckRunner(int itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public CheckRunner(int itemId, int quantity, int userCard) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.userCard = userCard;
    }

//    public CheckRunner printReceipt(int itemId, int quantity){
//
//        ProductService productService = new ProductService();
//        CheckRunner checkRunner = new CheckRunner(itemId, quantity);
//        int priceById = ;
//        int countPrice = 0;
//        countPrice = countPrice + quantity * ;
//        return ;
//    }
}
