package basicsVVI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListtoArray {
 public static void main(String[] args) {
	List<Integer> numList=new ArrayList<Integer>();
	numList.add(10);
	numList.add(20);
	numList.add(10);
	numList.add(30);
	numList.add(40);
	
	int arr[]=new int[numList.size()];
	for(int i=0;i<arr.length;i++)
	{
		
		arr[i]=numList.get(i);
		
		
	}
	 //PrintArray
	System.out.println("Print from Array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
			
	}	
	//printList
	System.out.println("\nPrint from List");
	for(int res:numList)
	{
		System.out.print(" "+res);
	}
	
	//to print Unique content
	HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++)
	{
		hmap.put(arr[i],i);
		
	}
	System.out.println("With out Duplicates");
	System.out.println(hmap.keySet());
	
	//print onlu duplicate element in hashset
	
}
	
}
