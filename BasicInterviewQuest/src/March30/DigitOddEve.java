package March30;

import java.util.Scanner;

public class DigitOddEve {

	
	   public static void main(String args[]){
		   int count = 0;
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	    	  arr[i]=sc.nextInt();
	      }
	      
	      for(int i=0;i<n;i++)
	      {
	    	  
	      int num=arr[i];
	      while(num!=0){
	         num = num/10;
	         count++;
	      }
	      if(count%2==0)
	      {
	    	  System.out.println("Eve Digit: "+num);
	      }
	      else
	      {
	    	  System.out.println("odd Digit: "+num);
	      }
	      }
	      //System.out.println("Number of digits in the entered integer are :: "+count);

}
}
