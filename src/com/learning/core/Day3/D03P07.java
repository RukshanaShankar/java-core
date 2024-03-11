package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {
	public static void subseq(String str) {
        subseq(str, "");
    }

    public static void subseq(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        subseq(str.substring(1), prefix);
        subseq(str.substring(1), prefix + str.charAt(0));
    }
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		subseq(s);
	}
		

}
