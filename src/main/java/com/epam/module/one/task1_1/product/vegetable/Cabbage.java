package com.epam.module.one.task1_1.product.vegetable;

import com.epam.module.one.task1_1.product.ProductType;

public class Cabbage extends Vegetable {
    public Cabbage(double weightInGrams, double calories) {
        super(weightInGrams, calories, ProductType.CABBAGE);
    }
}
