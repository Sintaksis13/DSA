package com.epam.module.one.task1_1.product.meat;

import com.epam.module.one.task1_1.product.Product;
import com.epam.module.one.task1_1.product.ProductType;

public abstract class Meat extends Product {
    public Meat(double weightInGrams, double caloriesInKcal, ProductType productType) {
        super(weightInGrams, caloriesInKcal, productType);
    }
}
