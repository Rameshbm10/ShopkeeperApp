package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args){
        List<Product> basket= new ArrayList<>();
        basket.add(new Product("Leather wallet",1100,18,1));
        basket.add(new Product("Umbrella",900,12,4));
        basket.add(new Product("Cigarette",200,28,3));
        basket.add(new Product("Honey",100,0,2));

        double totalAmount=0;
        Product maxGSTProduct=null;
        double maxGSTAmount=0;

        for(Product product:basket){
            double productTotalPrice=product.getTotalPrice();
            totalAmount+=productTotalPrice;
            double gstAmount=(productTotalPrice-product.unitPrice*product.quantity)/(1+product.gstPercentage/100);
            if(gstAmount>maxGSTAmount){
                maxGSTAmount=gstAmount;
                maxGSTProduct=product;
            }
        }
        System.out.println("Total amount to be paid to the shopkeeper: "+totalAmount);
        System.out.println("Product with maximum GST amount: "+maxGSTProduct.productName);
    }
}
