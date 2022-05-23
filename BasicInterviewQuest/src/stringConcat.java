	import java.lang.*;
public class stringConcat {


	
//	    public static void main(String[] args) {
//	     // Two String objects
//	     String str1 = "Hello";
//	     String str2 = "World";
//	  
//	     /* Using concat() method, concat first string with second string and
//	        storing into result string */
//	      
//	      str2 = str1.concat(str2);
//	      
//	     // Print the result
//	     System.out.println(str2);
//	     System.out.println(str1);
//	     System.out.println(str2);
//	     
//	}
	  public static void main(String[] args) {
		     // Two String objects
		     String str1 = "Hello";
		     String str2 = "World";
		     


		     // StringBuffer object
		     StringBuffer sb = new StringBuffer();
		     StringBuffer sb1 = new StringBuffer("Mr. ");
		     // Appending str1 and str2 
		     sb.append(str1).append(sb1);
		     sb1.append(sb).append(str2); 
		  
		     // Print the result
		     System.out.println(sb);
		     System.out.println(sb1);
		}
}
