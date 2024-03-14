package com.learning.core.day9;

import java.util.Scanner;

class LinearSearch
{
	public void search(int arr[],int key)
	{   boolean flag = false;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==key)
				{flag=true;
				System.out.println("Element is Present ");
				
				break;
				}
		}
		if(flag==false)
		{
			System.out.println("Element is not Present");
		}
	}
}

public class D09P03 {
	
	public static void main(String[] args)
	{   LinearSearch l = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0;i<5;i++)
		{
			arr[i]= sc.nextInt();
		}
		int find = sc.nextInt();
		
		l.search(arr, find);
		
		
	}

}
