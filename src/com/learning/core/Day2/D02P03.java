package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args)
	{   Scanner sc = new Scanner(System.in);
	    int num1,num2,result;
	    num1=sc.nextInt();
	    num2=sc.nextInt();
	    char op = sc.next().charAt(0);
	    switch (op) 
	    {
        case '+':
            result = num1 + num2;
            System.out.println(result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println(result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println(result);
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(result);
            } 
        default:
	       System.out.println("Invalid Input");
	       break;
	    }
	}
}
