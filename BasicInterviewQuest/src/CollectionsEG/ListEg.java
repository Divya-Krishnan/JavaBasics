package CollectionsEG;

import java.util.ArrayList;
import java.util.List;

public class ListEg {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Divya");
		list.add("is");
		list.add("an");
		list.add("ambitious");
		list.add("fellow");
		
		list.forEach(values->System.out.println(values));
	}
}
