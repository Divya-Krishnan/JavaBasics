import java.util.Scanner;

class Train {

	 String trainName;
	 String trainNumber;
	 String sourceStation;
	 String destinationStation;
	void getData(String trainName, String trainNumber, String sourceStation,String destinationStation) {
		//super();
		//for(int i=0;i<=num*4;i++)
		{
		this.trainName = trainName;
		this.trainNumber = trainNumber;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		}
	}
	void check(String source, String dest, int n)
	{
		Train [] arr=null;
		for(int i=0;i<n;i++) {
		if(source.equals(arr[i].sourceStation) && dest.equals(arr[i].destinationStation))
		{
			int count=0;
			count++;
			System.out.println(count);
		}
		}
	}
	 
}

 class test2
{
	public static void main(String as[])
	{
		Train[] arr;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 String trainName=sc.next();
		 String trainNumber=sc.next();
		 String sourceStation=sc.next();
		 String destinationStation=sc.next();
		arr=new Train[n];
		for(int i=0;i<=n;i++)
		{
			arr[i]=new Train();
			arr[i].getData(trainName, trainNumber, sourceStation, destinationStation);
			
		}
		String urSource=sc.next();
		String urDest=sc.next();
		for(int i=0;i<=n;i++)
		{
			arr[i]=new Train();
			arr[i].check(urSource, urDest, n);
			
		}
		
	}
}
