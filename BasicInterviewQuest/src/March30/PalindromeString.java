package March30;

public class PalindromeString {
public static void main(String[] args) {
	String s="madame";
	//char c[]=s.toCharArray();
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("Palin");
	}
	else
	{
		System.out.println("Not palin");
	}
}
}
