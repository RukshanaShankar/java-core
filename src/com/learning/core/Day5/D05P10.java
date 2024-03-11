package com.learning.core.day5;

import java.util.HashSet;

public class D05P10 {
	public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        productSet.add(new Product("P001", "iPhone 13"));
        productSet.add(new Product("P002", "Samsung Galaxy S21"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Sony PlayStation 5"));

        String searchProductId = "P003";
        String searchProductName = "Maruti Dezire";
        Product searchProduct = new Product(searchProductId, searchProductName);

        if (productSet.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
	}

}
