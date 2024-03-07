package com.learning.core.day5;

import java.util.HashSet;

public class D05P03 
{
public static void main(String[] args)
{
        
        HashSet<Product> prodSet = new HashSet<>();

        prodSet.add(new Product("P001", "Maruti 800"));
        prodSet.add(new Product("P002", "Marutizen"));
        prodSet.add(new Product("P003", "Maruti Dezire"));
        prodSet.add(new Product("P004", "Maruti Alto"));

      
        for (Product product : prodSet) 
        {
            System.out.println(product);
        }
    }
}
