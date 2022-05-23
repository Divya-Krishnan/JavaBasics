
public class Typecasting {
public	static void main(String as[])
{
	int number=67;
	System.out.println("NUmber Before Type Cast: "+number);
	
	//int to char 
	char numberChar=(char)number;
	//Will print relevant ASCII Code
	System.out.println("Number after type cast to char : "+numberChar);
	
	//int to short
	short numberShort=(short)number;
	System.out.println("Number after type cast to short : "+numberShort);
	
	
	//int to byte
		byte numberByte=(byte)number;
		System.out.println("Number after type cast to Byte : "+numberByte);
		
	//int to float
		float numberFloat=(float)number;
		System.out.println("Number after type cast to Float : "+numberFloat);
		
		//float to int
		float decimal=2.14f;
		System.out.println("***************************************");
		System.out.println("Decimal before type cast  : "+decimal);
		int decimalInt=(int)decimal;
		System.out.println("Number after type cast to Int : "+decimalInt);
		
	//char to short
		char letter='R';
		System.out.println("***************************************");
		System.out.println("Letter Before typecast : "+letter);
		short letterShort=(short)letter;
		System.out.println("Letter After typecast to short: "+letterShort);
		
	//char to Byte
		byte letterByte=(byte)letter;
		System.out.println("Letter After typecast to byte: "+letterByte);
	
}
}
