package com.learning.core.day5;

import java.util.TreeSet;

public class D05P06 {
	 public static void main(String[] args) {
	        // Creating Person objects
	        Person person1 = new Person(5, "John", 32, 1999);
	        Person person2 = new Person(6, "Tom", 42, 3999);
	        

	        // Storing persons in a TreeSet
	        TreeSet<Person> personSet = new TreeSet<>();
	        personSet.add(person1);
	        personSet.add(person2);
	        

	        // Printing persons with age greater than 25
	        for (Person person : personSet) {
	            if (person.getAge() > 25) {
	                System.out.println(person);
	            }
	        }
	    }
}
