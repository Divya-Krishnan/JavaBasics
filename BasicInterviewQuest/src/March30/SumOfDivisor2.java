package March30;

import java.util.Scanner;

interface Arithmetic
{
	public int divisorSum(int n);
}
class Calculator implements Arithmetic
{
	public int divisorSum(int n)
	{
		int j=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				j=j+i;
			}
		}
		return j;
		
	}
}
public class SumOfDivisor2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Calculator calc=new Calculator();
		int result=calc.divisorSum(number);
		System.out.println(result);

	}

}
