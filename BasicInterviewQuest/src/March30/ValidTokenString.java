package March30;

import java.util.Scanner;

public class ValidTokenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int valid=0, invalid=0;
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
			
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++)
			
		{
		try
		{
			int x=Integer.parseInt(arr[i]);
			valid++;
		}
		catch(NumberFormatException ne)
		{
			invalid++;
		}
		
			
		
		}
		
		System.out.println(invalid);
		System.out.println(valid);

}
}
