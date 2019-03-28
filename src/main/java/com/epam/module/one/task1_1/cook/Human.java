package com.epam.module.one.task1_1.cook;

import com.epam.module.one.task1_1.dish.Borsch;
import com.epam.module.one.task1_1.product.meat.Meat;
import com.epam.module.one.task1_1.product.vegetable.Cabbage;
import com.epam.module.one.task1_1.product.vegetable.Potato;

public class Human implements Cook {
    @Override
    public Borsch makeBorsch(Meat meat, Cabbage cabbage, Potato potato) {
        return new Borsch(meat, cabbage, potato);
    }

    @Override
    public double computeCalories(Borsch borsch) {
        return borsch.getBeef().getCaloriesInKcal()
                + borsch.getCabbage().getCaloriesInKcal()
                + borsch.getPotato().getCaloriesInKcal();
    }
}
