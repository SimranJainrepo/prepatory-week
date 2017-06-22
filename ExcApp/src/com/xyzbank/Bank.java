package com.xyzbank;
import java.util.*;
public class Bank
{
	public void Withdraw (int amt) throws BankException
	{
		int balance=1000;
		if((balance-amt)<500)
			throw new BankException();
		else
			System.out.println("Transaction Successfull");
		}
	

	public static void main(String[] args)
	{
		Bank obj=new Bank();
		int amt;
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the amount you want to withdraw");
			amt=scan.nextInt();
			obj.Withdraw(amt);
			
		}
		catch(BankException be)
		{
			System.out.println("Exception Arised:"+be);
		}
		
		

	}

}
