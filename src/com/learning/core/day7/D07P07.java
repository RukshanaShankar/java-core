package com.learning.core.day7;

class ClassStack{
	int n;
    int arr[];
    int top;
    
    public ClassStack(int n)
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
    public void peep()
    { if(arr[top]%2==0)
      {
    	System.out.println("true");
      }
    else 
    {
    	System.out.println("false");
       }
    
    }
    

	
}

public class D07P07 {
	public static void main(String[] args)
	{ ClassStack s = new ClassStack(4);
	  s.push(40);
	  s.push(30);
	  s.push(25);
	  s.push(15);
	  
	  s.peep();
	}
}
