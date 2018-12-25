package com.epam.chiefcook.products.vegetables;

import com.epam.chiefcook.products.Product;

public abstract class Vegetable extends Product {
    public Vegetable(double weightInGrams, int count) {
        super(weightInGrams, count);
    }
}
