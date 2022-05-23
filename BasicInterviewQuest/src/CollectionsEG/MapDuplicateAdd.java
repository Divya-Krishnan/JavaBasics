package CollectionsEG;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicateAdd {
	public static void main(String[] args) {
		
	
	Map<String, Integer> obj=new HashMap<String,Integer>();
	obj.put("Divya", new Integer(100));
	obj.put("Shree",78);
	obj.put("Hen",98);
	obj.put("Hen",65);
	
	for(Map.Entry<String,Integer> me : obj.entrySet())
	{
		System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
	}
	
	}
}
