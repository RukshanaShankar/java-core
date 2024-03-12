package com.learning.core.day7;

class stack2{
	int n;
    int arr[];
    int top;
    
    public stack2(int n)
    { this.n=n;
      this.arr= new int[n];
      top=-1;
    }
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull()
    {   
		return (n-1 ==top);
    	
    }
    public boolean isEmpty()
    {   
		return (top== -1);
    	
    }
    public void push(int data)
    {  if(isFull())
    {
    	System.out.println("Stack is full");
    }else
    {
    	top++;
    	arr[top] = data;
    }
    }
    public int pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack is empty");
    		return -1;
    	}
    	else
    	{
    		int value = arr[top];
    		top--;
    		return value;
    	}
    }
    public void reverse()
    {
  	  if(isEmpty())
  	  {
  		  System.out.println("Stack is Empty");
  	  }
  	  else
  	  {
  		  int[] rev = new int[arr.length];  
  		  int index = 0;
  		  
  		  while(!isEmpty())
  		  {
  			  int temp = pop();
  			  rev[index] = temp;
  			  index++;
  		  }
  		  
  		  for(int i=0;i<index;i++)
  		  {
  			  push(rev[i]);
  			  System.out.println(rev[i]);
  		  }
  	  }
    

	
}

public class D07P05 {
	public static void main(String[]args)
	{
		stack2 s = new stack2(4);
		  s.push(1);
		  s.push(2);
		  s.push(3);
		  s.push(4);
		  
		  s.reverse();
		  
	}
}

}
