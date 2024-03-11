package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
	
	public static boolean palindrome(String word) {
        int l = 0;
        int r = word.length() - 1;

        while (l < r) {
            if (word.charAt(l) != word.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		if (palindrome(s)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
		
	}

}
