package com.epam.module.one.task1_1.cook;

import com.epam.module.one.task1_1.dish.Borsch;
import com.epam.module.one.task1_1.product.meat.Meat;
import com.epam.module.one.task1_1.product.vegetable.Cabbage;
import com.epam.module.one.task1_1.product.vegetable.Potato;

public interface Cook {
    Borsch makeBorsch(Meat meat, Cabbage cabbage, Potato potato);

    double computeCalories(Borsch borsch);
}
