package com.epam.module.one.task1_1.refrigerator;

import com.epam.module.one.task1_1.exception.ProductIsAbsentException;
import com.epam.module.one.task1_1.product.Product;
import com.epam.module.one.task1_1.product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {
    private static List<Product> products = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public static <T extends Product> T getProductFromRefrigerator(ProductType type) throws ProductIsAbsentException {
        Product product = products.stream()
                .filter((_product) -> _product.getProductType() == type)
                .findFirst()
                .orElseThrow(() -> new ProductIsAbsentException(String.format("There are no %s!", type)));
        products.remove(product);
        return (T) product;
    }

    public static boolean putProductToRefrigerator(Product product) {
        return products.add(product);
    }
}
