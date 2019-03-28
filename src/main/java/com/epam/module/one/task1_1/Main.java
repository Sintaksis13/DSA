package com.epam.module.one.task1_1;

import com.epam.module.one.task1_1.cook.Cook;
import com.epam.module.one.task1_1.cook.Human;
import com.epam.module.one.task1_1.dish.Borsch;
import com.epam.module.one.task1_1.exception.ProductIsAbsentException;
import com.epam.module.one.task1_1.product.ProductType;
import com.epam.module.one.task1_1.product.meat.Beef;
import com.epam.module.one.task1_1.product.meat.Meat;
import com.epam.module.one.task1_1.product.vegetable.Cabbage;
import com.epam.module.one.task1_1.product.vegetable.Potato;
import com.epam.module.one.task1_1.refrigerator.Refrigerator;

public class Main {
    public static void main(String[] args) {
        Refrigerator.putProductToRefrigerator(new Beef(250, 120));
        Refrigerator.putProductToRefrigerator(new Cabbage(500, 200));
        Refrigerator.putProductToRefrigerator(new Potato(300, 80));
        try {
            Meat beef = Refrigerator.getProductFromRefrigerator(ProductType.BEEF);
            Cabbage cabbage = Refrigerator.getProductFromRefrigerator(ProductType.CABBAGE);
            Potato potato = Refrigerator.getProductFromRefrigerator(ProductType.POTATO);

            Cook cook = new Human();
            Borsch borsch = cook.makeBorsch(beef, cabbage, potato);
            System.out.println(borsch);

            System.out.println("Calories in borsch = " + cook.computeCalories(borsch));

            beef = Refrigerator.getProductFromRefrigerator(ProductType.BEEF);
            System.out.println(beef);
        } catch (ProductIsAbsentException e) {
            System.err.println("Unfortunately, you cannot make borsch without appropriate products...");
        }
    }
}
