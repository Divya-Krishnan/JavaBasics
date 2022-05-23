package basicsVVI;

public class OccuranceOfSearchedStr {
public static void main(String[] args) {
	String s="Stress Buster";
	String lower=s.toLowerCase();
	char search='s';
	int count =0;
	for(int i=0;i<s.length()-1;i++)
	{
		if(lower.charAt(i) == search)
		{
			count++;
		}
	}
	System.out.println(count);
	
}
}
