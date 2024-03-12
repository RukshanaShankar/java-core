package com.learnin.core.day4;

public class D04P02 {
	public static void main(String[] args)
	{
		CricketRating c1= new CricketRating("john",9.3,9.67,8.7);
		try
		{
			c1.calculateAvergageRating(c1.critic1, c1.critic2);
			c1.calculateAvergageRating(c1.critic1, c1.critic2, c1.critic3);
			c1.coins=c1.calculateCoins();
			c1.display();
		}
		catch(NotEligibleException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
