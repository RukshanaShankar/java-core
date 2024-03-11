package com.learnin.core.day4;

public class D04P01 {
	public static void main(String[] args)
	{
		//BankAccount b=new BankAccount();
		BankAccount b1=new BankAccount(123,"john","current",15000);
		try
		{
			b1.deposit(900);
			System.out.println(b1.getBalance());
		}
		catch(depositexception | lowbalanceexception e)
		{
			e.printStackTrace();
		}
		
	}
}
