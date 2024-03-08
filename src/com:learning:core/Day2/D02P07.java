package com.learning.core.day2;

import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args)
	{   int percentage;
		Scanner sc = new Scanner(System.in);
		percentage=sc.nextInt();
		if(percentage >= 60)
	    {
	    	System.out.println("A Grade");
	    }else if (percentage >= 45)
	    {
	    	System.out.println("B Grade");
	    }else if (percentage >= 33)
	    {
	    	System.out.println("C Grade");
	    }else
	    {
	    	System.out.println("Fail");
	    }
	}
	
}
