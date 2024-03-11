package com.learning.core.day6;

import java.util.Objects;

public class PhoneBook 
{  private String name;
   private long phoneno;
	
	public PhoneBook() 
	{
		super();
	}
    public PhoneBook(String name, long phoneno)
    {
		super();
		this.name = name;
		this.phoneno = phoneno;
	 }

    public String getName() 
    {
	return name;
     }
    public void setName(String name)
    {
	this.name = name;
    }
     public long getPhoneno() 
     {
	return phoneno; 
	}
    public void setPhoneno(long phoneno)
    {
	this.phoneno = phoneno;
     }
    @Override
    public int hashCode() {
	return Objects.hash(name, phoneno);
     }
     @Override
    public boolean equals(Object obj)
     {
	   if (this == obj)
		return true;
	   if (obj == null)
		return false;
	   if (getClass() != obj.getClass())
		return false;
	      PhoneBook other = (PhoneBook) obj;
	    return Objects.equals(name, other.name) && phoneno == other.phoneno;
      }
      @Override
     public String toString() 
      {
	    return "PhoneBook [name=" + name + ", phoneno=" + phoneno + "]";
      }
  

}
