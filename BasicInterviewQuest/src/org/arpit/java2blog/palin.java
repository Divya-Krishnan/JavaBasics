package org.arpit.java2blog;


import java.util.Scanner;

public class palin {
	public static void main(String[] args) {
		int num,unit, hun;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num :");
		num=sc.nextInt();
		if(num>99 && num <1000)
		{
			unit=num%10;
			hun=(num/100);
			if(unit==hun)
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		else
			System.out.println("no");
	}
	
	

}
