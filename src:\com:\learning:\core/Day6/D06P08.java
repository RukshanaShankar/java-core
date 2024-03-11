package com.learning.core.day6;

import java.util.Map;
import java.util.TreeMap;

public class D06P08 {
public static void main(String[] args) {
        
        TreeMap<Car, String> carDetails = new TreeMap<>();

       
        carDetails.put(new Car("Bugatti", 80050.0), "1");
        carDetails.put(new Car("Swift", 305000.0), "2");
        carDetails.put(new Car("Audi", 600100.0), "3");
        carDetails.put(new Car("Benz", 900000.0), "4");

        
        Map.Entry<Car, String> greatestEntry = carDetails.pollLastEntry();
        System.out.println("Car with the greatest price removed: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

        
        for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getValue() + ". " + entry.getKey());
        }
    }
}
