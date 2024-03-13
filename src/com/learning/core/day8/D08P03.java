package com.learning.core.day8;

import java.util.Scanner;

class QueueCircular 
{
	   int front = -1;
	   int rear = -1;
	   int arr[];
	   int n;
	   
	   public QueueCircular(int n)
	   {
		   this.n = n;
		   arr = new int[n];
	   }
	   
	   public boolean isFull()
	   {
		   return ((rear+1)%n)==front;
	   }
	   
	   public boolean isEmpty()
	   {
		   return front==-1 && rear==-1;
	   }
	   
	   public void enqueue(int data)
	   {
		   if(isFull())
		   {
			   System.out.println("Queue is Full");
		   }
		   else if(isEmpty())  
		   {
			   rear = front = 0;
			   arr[rear] = data;
		   }
		   else  
		   {
			   rear = (rear+1) % n;
			   arr[rear] = data;
		   }
	   }
	   
	   public int dequeue()
	   {
		   if(isEmpty()) 
		   {
			   System.out.println("Queue is Empty");
			   return -1;
		   }
		   else if(front==rear) 
		   {
			   int top = arr[front];
			   front = rear = -1;
			   return top;
		   }
		   else
		   {
			   int top = arr[front];
			   front = (front+1) % n;
			   return top;
		   }
	   }
	   
	   public int peek()
	   {
		   if(isEmpty())  
		   {
			   System.out.println("Queue is Empty");
			   return -1;
		   }
		   else
		   {
			   int top = arr[front];
			   return top;
		   }
	   }
}
	   

public class D08P03 {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		QueueCircular q = new QueueCircular(4);
		
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.nextInt());
		}
		q.dequeue();
		System.out.println("After removing first element:");
		for(int i=0;i<3;i++)
		  {  
			  System.out.print( q.dequeue()+" ");
		  }
	}
}


