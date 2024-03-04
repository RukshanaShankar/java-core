package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int n,i;
	    n=sc.nextInt();
        i=sc.nextInt();
        int res=1;
        while(i!=0)
        {
        	res=res*n;
        	i--;
        }
	System.out.println(res);

	}
}
