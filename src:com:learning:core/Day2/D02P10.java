package com.learning.core.day2;

import java.util.Scanner;

public class D02P10 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int num,rev=0;
	    num=sc.nextInt();
	    while(num != 0) {
            int ans = num % 10;
            rev = rev * 10 + ans;
            num /= 10;
        }
	    System.out.println(rev);
	}
}
