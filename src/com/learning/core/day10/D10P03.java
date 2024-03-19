package com.learning.core.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D10P03 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f=new FileInputStream("Test.txt");
			ObjectInputStream o=new ObjectInputStream(f);
			Student s=(Student)o.readObject();
			System.out.println(s.getName()+" "+s.getRollno()+" "+s.getAge()+" "+s.getAddress());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

       
    }
}
