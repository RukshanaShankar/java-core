package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02_Student 
{
	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the list of student names separated by space: ");
		String studentnames = scanner.nextLine();

		String[] arr = studentnames.split("\\s+");

		for (String names : arr) {
			studentList.add(names);
		}

		System.out.print("Enter the name to search: ");
		String searchName = scanner.nextLine();

		if (studentList.contains(searchName)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		scanner.close();
	}	

}
