package March30;

import java.util.Scanner;

class A
{
	 public void findNumbers(int[] nums) {
	        // keep track of the amount to return
	        int evens = 0;
	        int odd=0;
	        
	        // loop through all the nums
	        for (int i=0; i<nums.length; i++) {
	            
	            int digits = 0, num = nums[i];
	            // while we divide by 10
	            while (num!=0) {
	                num /= 10;
	                // increment our count
	                ++digits;
	            }
	            
	            // increment if even
	            if (digits%2==0)
	            	{evens++;
	            	
	            	}
	            else
	            {
	            	odd++;
	            	
            	}
	            
	            }
	        System.out.println("Even: "+evens);
            System.out.println("Odd: "+odd);  
	        }
	        
	       // return evens;
	    }


public class TestODDEVEDIG {

	public static void main(String[] args) {
		A a=new A();
		Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	    	  arr[i]=sc.nextInt();
	      }
	      
	     a.findNumbers(arr);
/*	      for(int i=0;i<n;i++)
	      {
	    	  
	      //int num=arr[i];
	      a.findNumbers(arr[i]);
	      }*/
	}

}
