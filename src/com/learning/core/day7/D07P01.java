package com.learning.core.day7;
class stack{
	int n;
    String arr[];
    int top;
    
    public stack(int n)
    { this.n=n;
      this.arr= new String[n];
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
    public void push(String data)
    {  if(isFull())
    {
    	System.out.println("Stack is full");
    }else
    {
    	top++;
    	arr[top] = data;
    }
    }
    public String pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack is empty");
    		return null;
    	}
    	else
    	{
    		String value = arr[top];
    		top--;
    		return value;
    	}
    }
    

	
}
public class D07P01 
{   public static void main(String[] args)
	{ stack s = new stack(4);
	  s.push("hello");
	  s.push("world");
	  s.push("java");
	  s.push("programming");
	  
	  System.out.println("After pusing 4 elements");
	  s.display();
	  s.pop();
	  System.out.println("After a Pop");
	  s.display();
	
	}
}
