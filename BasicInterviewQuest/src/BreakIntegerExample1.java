import java.util.Scanner;  
public class BreakIntegerExample1  
{  
public static void main(String[] args)  
{  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a three-digit number: ");  
//reading a number from the user  
int number=sc.nextInt();  
  
int digit3=number/100%10;  
int digit2=number/10%10;  
int digit1=number%10;  
int luckyNo;
//prints the digits  
//System.out.println(digit1 + "," + digit2 + "," + digit3 );  
if (digit1 <=7 & digit2<=7 &  digit3<=7)
{
	if(digit2%3==0)
	{
		luckyNo=(digit3*digit3*digit3)+(digit1*digit1);
		System.out.println("lucky No: "+luckyNo);
	}
	else if(digit2%5==0)
	{
		luckyNo=(digit3*digit3)+(digit1*digit1*digit1);
		System.out.println("lucky No: "+luckyNo);
	}
	else
	{
		luckyNo=digit3+digit2+digit1;
		System.out.println("lucky No: "+luckyNo);
	}
}
else
{
	System.out.println("Invalid Number");
}

}  
} 