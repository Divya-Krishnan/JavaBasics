
public class PalinString {

	public static void main(String[] args) {
		String s="MADAM";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(s+" "+rev );
		
		if(s.equals(rev))
		{
			System.out.println("Palin");
		}
		else
		{
			System.out.println("Not Palin");
		}
		
	}

}
