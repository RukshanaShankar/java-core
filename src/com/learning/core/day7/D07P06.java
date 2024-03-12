package com.learning.core.day7;

class Stackclass{
	int n;
	  int arr[]; // Array to store the elements of the stack
	  int top; //Index of the top element 
	  
	  Stackclass(int n)
	  {
		  this.n = n; // size of the array
		  this.arr = new int[n];
		  this.top = -1;
	  }
	  
	  public boolean isEmpty()
	  {
		  return (top==-1);
	  }
	  
	  public boolean isFull()
	  {
		 return (n-1 == top);
	  }
	  
	  public void push(int data)
	  {
		 if(isFull())
		 {
			 System.out.println("Stack is Full");
		 }
		 else
		 {
			  top++;
			  arr[top] = data;
		 }
	  }
	  
	  public int pop()
	  {
		  if(isEmpty())
		  {
			  System.out.println("Stack is Empty");
			  return -1;
		  }
		  else
		  {
			  int value = arr[top];
			  top--;
			  return value;
		  }
	  }
	  
	  public int peek()
	  {
		  if(isEmpty())
		  {
			  System.out.println("Stack is Empty");
			  return -1;
		  }
		  else
		  {
			  return arr[top];
		  }
	  }
	  
	  public void getMin()
	  {
		  int min = arr[0];
		  if(isEmpty())
		  {
			  System.out.println("Stack Empty");
		  }
		  else
		  {
			  
			  for(int i =0;i<arr.length;i++)
			  {
				  if(arr[i]<min)
				  min = arr[i];
			  }
		  }
		  System.out.println("Minimum is "+min);
	  }
	 
	  
}

public class D07P06 {
	public static void main(String[] args)
	{ Stackclass s = new Stackclass(5);
	  s.push(16);
	  s.push(15);
	  s.push(29);
	  s.push(19);
	  s.push(18);
	  
	 s.getMin();
	
	}

}
