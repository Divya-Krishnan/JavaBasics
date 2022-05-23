package LambdaExpression;
//Java 8 Features

//Functional Interface
@FunctionalInterface
interface MyInterface
{
	public String getValue(int a);
	//Default method
	default void meth()
	{
		System.out.println("This is default");
	}
	//Static method inside Interface
	 static void meth2(int count)
	{
		for(int i=1;i<3;i++)
			{count+=1;}
		System.out.println("The count after inc "+count);
	}
	 default void meth3()
	 {
		 System.out.println("Interface will allow any no. of default meth");
	 }
}
public class TernaryOP {

	public static void main(String[] args) {
		
		//Lambda Expression
		MyInterface myI=(a)->{
			if(a>18)
			return "right to vote";
			else
				return "no right to vote";};
			System.out.println(myI.getValue(45));	
			myI.meth();
			MyInterface.meth2(7);
			myI.meth3();
			int array[]=new int[5];
			int count=1;
			for(int i=0;i<array.length;i++)
			{
				array[i]=count+i;
				
			}
			System.out.println("Elements in Array");
			
			for(int op:array)
			{
				System.out.println(op);
			}
			}
}
