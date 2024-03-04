package com.learning.core.day2;

import java.util.Scanner;

   

public class D02P17 {
	static void prime(int n)
    {
        int x, y, flg;
        for (x = 2; x <= n; x++) {
            flg = 1;
 
            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    prime(n);
	}
	
}
