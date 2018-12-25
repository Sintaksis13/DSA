package com.epam.chiefcook.products;

public abstract class Product {
    private double weightInGrams;
    private int count;

    public Product(double weightInGrams, int count) {
        this.weightInGrams = weightInGrams;
        this.count = count;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
