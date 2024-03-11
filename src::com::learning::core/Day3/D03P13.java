package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 {
	public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("&20");
            } else {
                sb.append(str.charAt(i));
            }
        }
    

        return sb.toString();
    }
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	System.out.println(replaceSpaces(str));
    	
    }

}
