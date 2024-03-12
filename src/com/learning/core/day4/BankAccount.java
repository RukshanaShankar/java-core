package com.learnin.core.day4;

public class BankAccount extends Exception
{
	
	int accno;
	String custName;
	String accType;
	float bal;
	public BankAccount(int accno, String custName, String accType, float bal) 
	{
		super();
		this.accno = accno;
		this.custName = custName;
		this.accType = accType;
		this.bal = bal;
	}
	public void deposit(float amt) throws depositexception
	{ 	if(amt>0)
	{
		bal = bal+ amt;
	}else
	{
		throw new depositexception();
	}
	}
    public float getBalance() throws lowbalanceexception
    {   if((bal>1000)&& (accType.equals("savings")) ||(bal>5000) && (accType.equals("current")))
    {
    	return bal;
    }
    else {
    	throw new lowbalanceexception();
    }
    	
   
    	
    }
}
