package basicsVVI;

public class reverseString {
public static void main(String[] args) {
	String s="Divya";
	char rev[]=new char[s.length()];
	rev=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(rev[i]);
	}
}
}

