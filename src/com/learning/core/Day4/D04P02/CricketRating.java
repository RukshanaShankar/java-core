package com.learnin.core.day4;

public class CricketRating 
{
	public CricketRating(String playerName, double d, double e, double f) {
		super();
		this.playerName = playerName;
		critic1 = (float) d;
		critic2 = (float) e;
		critic3 = (float) f;
	}
	String playerName;
	double critic1;
	double critic2;
	double critic3;
	double avgRating;
	String coins;
	
	
	public void calculateAvergageRating(double critic1,double critic2)
	{
		double sum = critic1+critic2;
		avgRating = sum/2;
	}
	public void calculateAvergageRating(double critic1,double critic2,double critic3)
	{
		double sum1= critic1+critic2+critic3;
		avgRating = sum1/3;
	}
	public String calculateCoins() throws NotEligibleException
	{   if(avgRating >=7)
	   { coins = "gold";
		
	   }else if ((avgRating>=5) && (avgRating <= 7))
	   {
		   coins = "silver";
		   
	   }else if ((avgRating>=2) && (avgRating <= 5))
	   {
		   coins= "copper";
		   
	   }
	   else 
	   {
		   throw new NotEligibleException();
	   }
		return coins;
		
	}
	void display()
	{
		System.out.println(playerName+" "+avgRating+" "+coins);
	}
}
