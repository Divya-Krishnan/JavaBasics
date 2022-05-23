package org.arpit.java2blog;
//Java code for Stream flatMap
	// (Function mapper) to get a stream by
	// replacing the stream with a mapped
	// stream by applying the provided mapping function.
	import java.util.*;
	import java.util.stream.Stream;
	  
	
public class StreamAndFlatMap {
	
	
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        // Creating a List of Strings
	        List<String> list = Arrays.asList("5.6", "7.4", "4",
	                                          "1", "2.3");
	  
	        // Using Stream flatMap(Function mapper)
	        list.stream().flatMap(num -> Stream.of(num)).
	                         forEach(System.out::println);
	    }
	}


