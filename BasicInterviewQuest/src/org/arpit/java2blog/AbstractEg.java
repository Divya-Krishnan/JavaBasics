package org.arpit.java2blog;

import java.util.Scanner;

abstract class Account
{
	private String name;
	private String accountNumber;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account()
	{
		System.out.println("Default Constructor");
	}
	public Account(String name, String accountNumber, double balance)
	{
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
				
	}
	abstract double computeMaintainanceCharge(int noOfYears);
		
	
	
}
class SavingsAccount extends Account{

	@Override
	double computeMaintainanceCharge(int noOfYears) {
		int n=noOfYears;
		int m=50;
		int mainCharge=(2*m*n)+50;
		//System.out.println("Maintenance Charge : "+mainCharge);
		
		return mainCharge;
	}
	
}
class CurrentAccount extends Account
{

	@Override
	double computeMaintainanceCharge(int noOfYears) {
		// TODO Auto-generated method stub
		int n=noOfYears;
		int m=100;
		int mainCharge=(m*n)+200;
		//System.out.println("Maintenance Charge : "+mainCharge);
		
		return mainCharge;
	}
	
}
public class AbstractEg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu \n1. Current Account \n2.Saving Account");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 2:
			Account account=new SavingsAccount();
			System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
			account.setName(sc.next());
			account.setAccountNumber(sc.next());
			account.setBalance(sc.nextDouble());
			int year=sc.nextInt();
			double computecharge=account.computeMaintainanceCharge(year);
			System.out.println("Maintenance Charge For Savings Account "+computecharge);
			break;
		case 1:
			Account account1=new CurrentAccount();
			System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
			account1.setName(sc.next());
			account1.setName(sc.next());
			account1.setAccountNumber(sc.next());
			account1.setBalance(sc.nextDouble());
			int year1=sc.nextInt();
			double computecharge1=account1.computeMaintainanceCharge(year1);
			System.out.println("Maintenance Charge For Savings Account "+computecharge1);
			break;
			default:
				System.out.println("invalid input");
		
		}
		
		
	}

}
