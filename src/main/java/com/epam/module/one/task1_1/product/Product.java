package com.epam.module.one.task1_1.product;

public abstract class Product {
    private double weightInGrams;
    private double caloriesInKcalOnHundredGrams;
    private double caloriesInKcal;
    private ProductType productType;

    public Product(double weightInGrams, double caloriesInKcal, ProductType productType) {
        this.weightInGrams = weightInGrams;
        this.caloriesInKcalOnHundredGrams = caloriesInKcal;
        this.productType = productType;
        this.caloriesInKcal = weightInGrams / 100 * caloriesInKcalOnHundredGrams;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getCaloriesInKcalOnHundredGrams() {
        return caloriesInKcalOnHundredGrams;
    }

    public void setCaloriesInKcalOnHundredGrams(double caloriesInKcalOnHundredGrams) {
        this.caloriesInKcalOnHundredGrams = caloriesInKcalOnHundredGrams;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getCaloriesInKcal() {
        return caloriesInKcal;
    }

    @Override
    public String toString() {
        return productType.toString().toUpperCase() + " { " +
                "weightInGrams=" + weightInGrams +
                ", caloriesInKcalOnHundredGrams=" + caloriesInKcalOnHundredGrams +
                " }";
    }
}
