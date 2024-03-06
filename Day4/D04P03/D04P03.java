package com.learnin.core.day4;

import java.util.Scanner;

public class D04P03 
{public static void main(String[] args)
{
	Applicant a=new Applicant("Mary","Assistant",20);
	Validator v1=new Validator(a.appName,a.postApp,a.age);
	
	try
	{
		boolean name=v1.isValidApplicantName(v1.appName);
		boolean post=v1.isValidPost(v1.postApp);
		boolean age=v1.isValidAge(v1.age);
		if(name==true && post==true && age==true)
		{
			System.out.println("All Details are Valid");
		}
		
	}
	catch(InvalidNameException | InvalidPostException | InvalidAgeException e)
	{
		e.printStackTrace();
	}
	
	
}







}