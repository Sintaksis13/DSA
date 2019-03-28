package com.epam.module.one.task1_1.product.meat;

import com.epam.module.one.task1_1.product.ProductType;

public class Beef extends Meat {
    public Beef(double weightInGrams, double caloriesInKcal) {
        super(weightInGrams, caloriesInKcal, ProductType.BEEF);
    }
}
