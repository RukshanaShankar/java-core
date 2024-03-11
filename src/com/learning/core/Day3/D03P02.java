package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,i;
		num1=sc.nextInt();
		num2=sc.nextInt();
		int[] arr = new int[5];
		for(i=0;i<5;i++)
			{
				arr[i] = sc.nextInt();
			}
		
	boolean matchnum1 = false;
    boolean matchnum2 = false;

    for (int j : arr)
    {
        if (j == num1) 
        {
            matchnum1 = true;
        }
        if (j == num2) 
        {
            matchnum2 = true;
        }
    }

    if (matchnum1 && matchnum2)
    {
        System.out.println("Its Bingo");
    } else 
    {
        System.out.println("Not found");
    }
	
	}
}
