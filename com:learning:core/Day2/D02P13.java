package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
	public static void main(String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
	int n;
    n= sc.nextInt();
    
    long fact = 1;
    
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    
    System.out.println(fact);
}

}
