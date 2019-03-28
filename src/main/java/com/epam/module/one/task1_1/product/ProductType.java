package com.epam.module.one.task1_1.product;

public enum ProductType {
    BEEF("beef"), CABBAGE("cabbage"), POTATO("potato");

    private String simpleName;

    ProductType(String simpleName) {
        this.simpleName = simpleName;
    }

    @Override
    public String toString() {
        return simpleName;
    }
}
