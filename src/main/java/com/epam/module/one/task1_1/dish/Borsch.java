package com.epam.module.one.task1_1.dish;

import com.epam.module.one.task1_1.product.meat.Meat;
import com.epam.module.one.task1_1.product.vegetable.Cabbage;
import com.epam.module.one.task1_1.product.vegetable.Potato;

public class Borsch {
    private final Meat beef;
    private final Cabbage cabbage;
    private final Potato potato;

    public Borsch(Meat meat, Cabbage cabbage, Potato potato) {
        this.beef = meat;
        this.cabbage = cabbage;
        this.potato = potato;
    }

    public Meat getBeef() {
        return beef;
    }

    public Cabbage getCabbage() {
        return cabbage;
    }

    public Potato getPotato() {
        return potato;
    }

    @Override
    public String toString() {
        return "Borsch { " +
                "beef=" + beef +
                ", cabbage=" + cabbage +
                ", potato=" + potato +
                " }";
    }
}
