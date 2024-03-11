package com.learning.core.day2;

import java.util.Scanner;

public class D02P12 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    int i,j;
	    for (i = n; i >= 0; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();

}
	}
}

