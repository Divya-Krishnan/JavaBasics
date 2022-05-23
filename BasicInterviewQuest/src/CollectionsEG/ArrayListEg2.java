package CollectionsEG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEg2 {
public static void main(String[] args) {
	List<Integer> numList=new ArrayList<Integer>();
	numList=Arrays.asList(21,32,12,6,3,78);
	System.out.println("Prints Elements in List");
	System.out.println(numList);
	//Copy List to another List
	List<Integer> copyList=new ArrayList<Integer>();
	copyList=numList;
	
	Iterator<Integer> itr=copyList.iterator();
	System.out.println("Prints Copy of List");
	while(itr.hasNext())
	{
		System.out.print(" "+itr.next());
	}
}
}
