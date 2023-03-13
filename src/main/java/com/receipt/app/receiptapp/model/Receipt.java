package com.receipt.app.receiptapp.model;

import lombok.Builder;
import lombok.Data;

@Data
public class Receipt {
    private int productId;
    private int quantity;
    private int price;
    public Receipt(){
    }
}
