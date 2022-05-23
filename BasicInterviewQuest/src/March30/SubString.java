package March30;

public class SubString {
	
	public static void main(String[] args) {
		String s="ManyaDhanya";
		System.out.println("Substr "+s.substring(0,3));
		System.out.println("Substr "+s.substring(0+3));
		
		s = s.substring(0, 3) + s.substring(0+ 3);
		System.out.println("After Operation "+s);
	}

}
