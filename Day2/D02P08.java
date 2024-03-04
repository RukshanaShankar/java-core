package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int L,R;
	    L=sc.nextInt();
	    R=sc.nextInt();
	    int res,n = 0,sum=0;
	    for(res=L;n <= R;n++)
	    {
	    	sum=sum+n;
	    	    }
	    System.out.println(sum);
		
	}  

}
