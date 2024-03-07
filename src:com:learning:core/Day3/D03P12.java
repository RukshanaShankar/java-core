package com.learning.core.day3;

import java.util.Scanner;

public class D03P12 {
	public static boolean split(String str) {
        int length = str.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += str.charAt(i) - '0';
        }

        return sum % 4 == 0;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (split(s)) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
		
	}
}
