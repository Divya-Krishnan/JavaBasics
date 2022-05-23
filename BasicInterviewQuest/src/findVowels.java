class VowelCheck
{
	boolean vowelCheckMeth(String input)
	{
		
		if (input.toLowerCase().matches("(.*)[aeiou](.*)") )
		{
			
			return true;
			
		}
		else
				
				return false;
		
	}
}
public class findVowels {
public static void main(String[] args) {
	VowelCheck vc=new VowelCheck();
	
	boolean result=vc.vowelCheckMeth("SKY WLK");
	System.out.println(result);
	
}
}
