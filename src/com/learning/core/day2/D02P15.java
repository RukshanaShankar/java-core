package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int n,pc=0,nc=0,zc=0;
	    n=sc.nextInt();
	    for (int i = 0; i < n; i++)
	    {   int num = sc.nextInt();
             if (num > 0) {
                pc++;
            } else if (num< 0) {
                nc++;
            } else {
                zc++;
            }
        }
	    System.out.println("No of positive Numbers: " + pc);
        System.out.println("No of negative Numbers: " + nc);
        System.out.println("No of zeros Numbers: " + zc);
      
	    
	}
}
