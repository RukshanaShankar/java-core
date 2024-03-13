package com.learning.core.day8;

class Queue
{
	int front=-1;
	int rear=-1;
	int arr[];
	int n;
	public Queue(int n)
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
	{
		for(int i= this.front;i<= this.rear;i++)
		{
			System.out.println(" " +arr[i]);
		}
	}
}

public class D08P05 {
  public static void main(String[] args)
  {
	  Queue q = new Queue(7);
	  Queue[] output = new Queue[2];
	  Queue oddq = new Queue(4);
	  Queue evenq = new Queue(4);
	  output[0] = oddq;
	  output[1] = evenq;
	  
	  q.enqueue(2);
	  q.enqueue(7);
	  q.enqueue(9);
	  q.enqueue(4);
	  q.enqueue(6);
	  q.enqueue(5);
	  q.enqueue(10);
	  
	  while(!q.isEmpty())
	  {
		  int data = q.dequeue();
		  if(data%2!=0)
		  {
			  oddq.enqueue(data);
		  }
		  else
		  {
			  evenq.enqueue(data);
		  }
	  }
	  System.out.println("Odd Queue:" );
	  oddq.display();
	  System.out.println("Even Queue:");
	  evenq.display();
  }
}
