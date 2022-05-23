package CollectionsEG;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Map<Integer,String> user=new HashMap<Integer,String>();
		//user.entrySet();
		
		user.put(1, "Divya");
		user.put(2, "Anand");
		user.put(3, "Raghul");
		user.put(4, "Maha");
		//System.out.println(user.entrySet());
		
		//using while loop
		//System.out.println("No of elements in Map " +user.size());
		Iterator itr=user.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry=(Map.Entry<Integer,String>)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
