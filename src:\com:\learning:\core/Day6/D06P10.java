package com.learning.core.day6;

import java.util.Hashtable;

public class D06P10 {
	public static void main(String[] args)
	{
	Hashtable<Integer, Employee> employeeDetails = new Hashtable<>();

    
    employeeDetails.put(1001,new Employee("John Doe", "IT", "Software Engineer"));
    employeeDetails.put(1002, new Employee("Alice Smith", "HR", "HR Manager"));
    employeeDetails.put(1003, new Employee("Bob Johnson", "Finance", "Accountant"));
    employeeDetails.put(1004, new Employee("Emily Brown", "Marketing", "Marketing Manager"));

    
    System.out.println( employeeDetails.isEmpty());
}
}
