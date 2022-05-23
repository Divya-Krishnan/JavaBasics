import java.util.Scanner;

public class ArrayPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
	int seat[]=new int[size];
	System.out.println("Enter Seating arrangement");
	for(int i=0;i<size;i++)
	{
		seat[i]=sc.nextInt();
	}
	int i=0;
	if(i<seat.length-1)
	{
		int temp=i;
		++i;
	if(((seat[temp]==4 && seat[i]==8) || (seat[temp]==8&&seat[i]==4)))
		
	{
		
		System.out.println("proper");
	}
	else
	{
		System.out.println("improper");
	}
	}
	
	

	}

	}

