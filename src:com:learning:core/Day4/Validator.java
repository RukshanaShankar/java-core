package com.learnin.core.day4;

public class Validator extends Applicant{
	
	
	public Validator(String name, String post, int age) {
		super(name, post, age);
	}
	public boolean isValidApplicantName(String s) throws InvalidNameException
	{
		String name=this.appName;
		if(name.isBlank()==false)
		{
			return true;
		}
		else
		{
			throw new InvalidNameException();
		}
		
	}
	public boolean isValidPost(String s) throws InvalidPostException
	{
		String post=this.postApp;
		if(post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cdre Officer"))
		{
			return true;
		}
		else
		{
			throw new InvalidPostException();
		}
		
	}
	public boolean isValidAge(int a) throws InvalidAgeException
	{
		int age=this.age;
		if(age>18 && age<30)
		{
			return true;
		}
		else
		{
			throw new InvalidAgeException();
		}
		
	}

}