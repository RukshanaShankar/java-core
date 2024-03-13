package com.learning.core.day8;

class QueueCheck
{
	int front=-1;
	int rear=-1;
	String arr[];
	int n;
	public QueueCheck(int n)
	{
		this.n = n;
		arr = new String[n]; 
	}
	public boolean isFull()
	{
		return rear== n-1;
	}
	public void isEmpty()
	{
		if(front== -1 && rear== -1)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not Empty");
		}
	}
	public void enqueue(String data)
	{
		if(isFull())
		{
			System.out.println();
		}
		else if(front== -1 && rear== -1)
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
	public String dequeue()
	{
		if(front== -1 && rear== -1)
		{   System.out.println("Queue is empty");
			return null;
		}
		else if (front== rear)
		{
			String top = arr[front];
			front = rear = -1;
			return top;
		}
		else
		{
			String top = arr[front];
			front++;
			return top;
		}
	}
	public void display()
	{ 
		for(int i= this.front;i<= this.rear;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

public class D08P04 {
	public static void main(String[] args)
	{
		QueueCheck q = new QueueCheck(4);
		  
		  q.enqueue("Yellow");
		  q.enqueue("Green");
		  q.enqueue("Pink");
		  q.enqueue("Black");
		  q.enqueue("Blue");
		  q.enqueue("White");
		  
		  q.isEmpty();
	}

}
