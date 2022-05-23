package CollectionsEG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArrayListOnlyUnique {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num=Arrays.asList(1,4,6,3,3,2);
		System.out.println("List : "+num);
		
		//Orderd collection without duplicates
		Set<Integer> set=new HashSet<Integer>();
		for(int i:num)
		{
			set.add(i);
			
		}
		System.out.println("Elements in set "+set);

		//ordered without duplicates
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int i:num)
		{
			map.put(i, i);
		}
		//Display with key and values
		System.out.println(map.entrySet());
		
		//Display only key
		System.out.println(map.keySet());
		
		//Display only value
		System.out.println(map.values());
			
			
		
	}

}
