package March30;

public class DuplicateChar2 {
public static void main(String[] args) {
	String s="Mahathmiyam";
	char arr[]=s.toCharArray();
	int count;
	for(int i=0;i<s.length();i++)
	{
		count=1;
		char c=s.charAt(i);
		
		for(int j=i+1;j<s.length();j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]=0;
			}
		}
		if(count>1 && arr[i]!=0)
		{
			System.out.println(arr[i]+" "+count);
		}
	}
}
}
