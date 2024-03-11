package com.learning.core.day6;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


class Car1 implements Comparable<Car1> { 
	String name; 
	double price; 
	public Car1(String name, double price) 
	{ 
		this.name = name; this.price = price;
	}

	@Override 
	public String toString() 
	{ 
		return name + ": $" + price;
	} 
	@Override
	public int hashCode() 
	{ 
		return Objects.hash(name, price); 
	} 
	@Override
	public boolean equals(Object obj) 
	{ 
		if (this == obj) return true; 
		if (obj == null || getClass() != obj.getClass()) 
			  return false;
		Car1 car = (Car1) obj; 
		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
	 } 
	@Override 
	public int compareTo(Car1 otherCar)
	{ 
		return Double.compare(this.price, otherCar.price); 
	} 
	}

public class D06P09 {
	public static void main(String[] args) {

		TreeMap<Car1, String> carDetails = new TreeMap<>(); 
		carDetails.put(new Car1("Bugatti", 80050.0), "1"); 
		carDetails.put(new Car1("Swift", 305000.0), "2"); 
		carDetails.put(new Car1("Audi", 600100.0), "3"); 
		carDetails.put(new Car1("Benz", 900000.0), "4"); 
		double keyToReplace = 80050.0; 

		String newValue = "Reva"; 
		for (Map.Entry<Car1, String> entry : carDetails.entrySet()) { 
			if (entry.getKey().price == keyToReplace) 
			{ 
				entry.setValue(newValue);
				break;
				} 
			} 
		for (Map.Entry<Car1, String> entry : carDetails.entrySet()) { 
 System.out.println(entry. getValue()+". "+entry.getKey());
}}

}
