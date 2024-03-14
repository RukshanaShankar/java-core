package com.learning.core.day9;

import java.util.Scanner;

class QuickSort
{
	public int partition(int arr[],int lb,int ub)
	{
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while(start<end)
		{
			start=start+1;
			while(start<=ub && arr[start]<pivot)
			{
				start++;
			}
			while(end>=lb && arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp = arr[start];
				arr[start]= arr[end];
				arr[end]= temp;
			}
		}
		int temp = arr[lb];
		arr[lb] = arr[end];
		arr[end]=temp;
		return end;
	}
	public void quicksort(int arr[],int lb,int ub)
	{
		int loc;
		if(lb<ub)
		{
			loc = partition(arr,lb,ub);
			quicksort(arr,lb,loc-1);
			quicksort(arr,loc+1,ub);
			
		}
	}
}

public class D009P01 {
	public static void main(String[] args)
	{
		int arr[]= new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		QuickSort q = new QuickSort();
		int n = arr.length;
		q.quicksort(arr, 0, n-1);
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
