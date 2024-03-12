package com.learning.core.day7;

class Node1
{
	char value;
	Node1 next;
}
public class Stackrev {
	Node1 head;
	public Stackrev()
	{
		head=null;
	}
	public void push(char c)
	{
		Node1 extranode=head;
		head=new Node1();
		head.value=c;
		head.next=extranode;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("null");
			return ' ' ;
		}
		else
		{
			char value=head.value;
			head=head.next;
			return value;
		}
		
	}
	

}
