
public class ReverseAString {
public static void main(String[] args) {
	String sample="Divya";
	StringBuilder sb =new StringBuilder(sample);
	
	System.out.println("String "+sample);
	System.out.println("After Reverse "+sb.reverse());
}
}