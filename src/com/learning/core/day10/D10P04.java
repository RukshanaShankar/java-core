package com.learning.core.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class D10P04 {
	public static void main(String[] args)
	{
		try
		{
			File inputfile= new File("color.txt");
			File outputfile= new File("coloroutput.txt");
			inputfile.createNewFile();
			outputfile.createNewFile();
			
			FileInputStream f=new FileInputStream(inputfile);
			FileOutputStream o=new FileOutputStream(outputfile);
			int c;
			while((c=f.read())!=-1)
			{
				o.write(c);
				o.flush();
			}
			f.close();
			o.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
