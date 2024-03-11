package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P02 
{
	public static void main(String[] args)
	{
		Map<String,Long> hm = new HashMap<String,Long>();
		hm.put("Amal",(long) 998787823);
		hm.put("Manvitha",(long) 937843978);
		hm.put("Joseph",(long) 788222113);
		hm.put("Smith",(long) 829389331);
		hm.put("Kathe",(long) 723456001);
		
		if(hm.containsKey("Joseph"))
			System.out.println(hm.get("Joseph"));
		
	}
}
