package com.learning.core.day7;

import java.util.Scanner;

public class D07P03 {
	public static void main(String[] args)
	{
		Stackrev s=new Stackrev();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i));
		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(s.pop());
		}
	}

}
