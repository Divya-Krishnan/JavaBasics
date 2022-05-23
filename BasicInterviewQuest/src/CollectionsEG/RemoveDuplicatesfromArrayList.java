package CollectionsEG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesfromArrayList {
public static void main(String[] args) {
	List <Integer> i=new ArrayList<Integer>();
	i=Arrays.asList(21,54,1,3,5,7,1,7);
	System.out.println("List "+i);
	
	//TO remove Duplicates
	List <Integer> duplicate=new ArrayList<Integer>();
	
	for(int num:i)
	{
		if(duplicate.contains(num))
		{
			break;
		}
		else
		{
			duplicate.add(num);
		}
	}
	System.out.println("After removing Duplicate : "+duplicate);
}
}
