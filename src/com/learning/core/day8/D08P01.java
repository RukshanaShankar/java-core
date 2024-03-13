package com.learning.core.day8;

import java.util.Scanner;

class Queue1
{
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	public Queue1(int n)
	{
		this.n = n;
		arr = new int[n]; 
	}
	public boolean isFull()
	{
		return rear== n-1;
	}
	public boolean isEmpty()
	{
		return front== -1 && rear== -1;
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(isEmpty())
		{
			rear = front =0;
			arr[rear] = data;
		}
		else
		{
			rear++;
			arr[rear] = data;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{   System.out.println("Queue is empty");
			return -1;
		}
		else if (front== rear)
		{
			int top = arr[front];
			front = rear = -1;
			return top;
		}
		else
		{
			int top = arr[front];
			front++;
			return top;
		}
	}
	public void display()
	{   System.out.println("Elements in queue: ");
		for(int i= this.front;i<= this.rear;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public void output_display()
	{   System.out.println("After removing first element:");
		for(int i= this.front;i<= this.rear;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}

public class D08P01 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Queue1 q = new Queue1(4);
		
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.nextInt());
		}
		  
		  
		  q.display();
		  q.dequeue();
		  System.out.println();
		  q.output_display();
		 
		  
		  
	}

}
