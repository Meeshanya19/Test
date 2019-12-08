package com.test.pikh.price;

import java.util.Map;

/**
 * Created by Michail on 12/8/2019.
 */
public class Price {
    private Map<Product,Map<String,Double>>PriceList;

    public Map<Product, Map<String, Double>> getPriceList() {
        return PriceList;
    }
}

