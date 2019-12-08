package com.test.pikh.services;

import com.test.pikh.price.Price;
import com.test.pikh.price.Product;

/**
 * Created by Michail on 12/8/2019.
 */
public class PriceService {
    Price price;

    public PriceService(Price price) {
        this.price = price;
    }

    public double getProductPriceByMonth(Product product, String month) {
        double productPrice = 0;
        try {
            productPrice = price.getPriceList().get(product).get(month);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return productPrice;
    }
}
