package com.learning.core.day2;

import java.util.Scanner;

public class D02P16 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int n,a=0,b=1,i;
	    n=sc.nextInt();
	    for(i=2;i<n;i++) {
	    	System.out.println(a+" ");
	    	int c = b+a;
	    	a=b;
	    	b=c;
	    }
	}
}
