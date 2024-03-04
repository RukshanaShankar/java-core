package com.learning.core.day2;

import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int i=1,n;
	    n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}

}
