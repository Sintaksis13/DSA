package com.epam.module.one.task1_1.product.vegetable;

import com.epam.module.one.task1_1.product.Product;
import com.epam.module.one.task1_1.product.ProductType;

public abstract class Vegetable extends Product {
    public Vegetable(double weightInGrams, double calories, ProductType productType) {
        super(weightInGrams, calories, productType);
    }
}
