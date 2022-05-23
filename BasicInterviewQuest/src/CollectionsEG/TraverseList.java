package CollectionsEG;

import java.util.ArrayList;
import java.util.List;

public class TraverseList {

	public static void main(String[] args) {
		
		List <String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grape");
		fruits.add("Grape");
		fruits.add(null);
		fruits.add(null);
		System.out.println("Printed as List " +fruits);
		for(String i :fruits)
		{
			System.out.println(i);
		}
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(22);
		num.add(1);
		System.out.println("Numbers as in List "+num);
		for(Integer i : num)
		{
			System.out.println(i);
		}
		
		Integer numArr[]=num.toArray(new Integer[num.size()]);
		System.out.println("Num Array : ");
		for (int i=0;i<numArr.length;i++)
		{
			System.out.println(numArr[i]);
		}
		
	}

}
