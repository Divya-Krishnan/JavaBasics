package March30;

public class FindRepeatedWords {
public static void main(String[] args) {
	String s="I am a java developer and I I am proud of it of ";
	String word[]=s.split(" ");
	int count;
	for(int i=0;i<word.length;i++)
	{
		count=1;
		for(int j=i+1;j<word.length;j++)
		{
			if(word[i].equals(word[j]))
			{
				count++;
				word[j]="0";  
			}
		}
		if(count>1 && word[i]!="0")
		{
			System.out.println(word[i]+" "+count);
		}
	}
}
}
