package com.epam.module.one.task1_1.product.vegetable;

import com.epam.module.one.task1_1.product.ProductType;

public class Potato extends Vegetable {
    public Potato(double weightInGrams, double calories) {
        super(weightInGrams, calories, ProductType.POTATO);
    }
}
