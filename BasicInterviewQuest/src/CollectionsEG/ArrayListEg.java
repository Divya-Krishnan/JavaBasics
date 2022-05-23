package CollectionsEG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEg {
public static void main(String[] args) {
	List<String> colors = new ArrayList<String>();
	colors.add("white");
	colors.add("Yellow");
	colors.add("green");
	colors.add("blue");
	
	//Add element at 1st position
	
	colors.add(1, "Cyan");
	//Print Through Iterator
	System.out.println("Print Through Iterator");
	Iterator<String> ite=colors.listIterator();
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}
	//to get element from Specified Index
	System.out.println("Colour in 4th Place is " +colors.get(4));
	
	//to remove third element from list and print
	colors.remove(3);
	 //Using foreach Loop
	System.out.println();
	System.out.println("After Removing Element 3 ");
	for(String c:colors)
	{
		System.out.print(" " + c);
	}
	//to search an element[eg.blue] in list
	if(colors.contains("blue"))
	{
		System.out.println("\nElement present at postion "+colors.indexOf("blue"));
	}
}
}
