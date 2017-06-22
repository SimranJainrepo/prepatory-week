package com.xyzbank;

public class BankException extends Exception 
{
	public BankException()
	{
		super("Balnce is not sufficient");
	}
	public String toString()
	{
		return"Balance is not sufficient";
	}

}
