package March30;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int temp, sum=0, rem;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		System.out.println("The reverse of number is "+sum);
		if(temp==sum)
		{
			System.out.println("Given number is palin");
		}
		else
		{
			System.out.println("Not a palin");
		}
	}

}
