package CollectionsEG;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSublistFromList {

	public static void main(String[] args) {
		List <Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(1,6,2,5,2,3,1);
		System.out.println("Main List "+list);
		list.subList(2,4).clear();
		System.out.println("After removing Sublist "+list);
	}

}*/
import java.util.*;

public class RemoveSublistFromList {
    public static void main(String args[])
    {
  
        // Creating an empty AbstractList
        AbstractList<String>
            list = new LinkedList<String>();
  
        // Using add() method
        // to add elements in the list
        list.add("GFG");
        list.add("for");
        list.add("Geeks");
        list.add("computer");
        list.add("portal");
  
        // Output the list
        System.out.println("Original List: "
                           + list);
  
        // subList and clear method
        // to remove elements
        // specified in the range
        list.subList(1, 3).clear();
  
        // Print the final list
        System.out.println("Final List: "
                           + list);
    }
}
