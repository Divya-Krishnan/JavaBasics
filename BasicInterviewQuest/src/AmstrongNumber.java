import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp,rem,sum=0;
		temp=number;
		while(number!=0)
		{
			rem=number%10;
			sum=sum+rem*rem*rem; // to find 3digit amstrong Number , to get 4 digit amstrong number add this (*rem) 
			number=number/10;
		}
		System.out.println(temp+"  "+sum);
		if(temp==sum)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not a Amstrong");
		}
	}

}
