package com.learning.core.day5;

import java.util.TreeSet;

public class D05P07 {
	public static void main(String[] args) 
	{

    // Creating Person objects
    
    Person person1 = new Person(1, "Jerry", 35, 999);
    Person person2 = new Person(2, "Smith", 48, 2999);
    Person person3 = new Person(3, "Poppeye", 31, 5999);
    Person person4 = new Person(4, "Jones", 45, 6999);
    Person person5 = new Person(5, "John", 32, 1999);
    Person person6 = new Person(6, "Tom", 42, 3999);
	TreeSet<Person> Personset=new TreeSet<Person>();
	Personset.add(person1);
	Personset.add(person2);
	Personset.add(person3);
	Personset.add(person4);
	Personset.add(person5);
	Personset.add(person6);
	for(Person p:Personset)
	{
	System.out.println(p);
	}
	}

}
