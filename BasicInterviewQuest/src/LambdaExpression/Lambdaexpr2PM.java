package LambdaExpression;
interface maths
{
	public int sum(int x, int y);
}
public class Lambdaexpr2PM {
	public static void main(String[] args) {
		
	
	maths m=(x,y)->(x+y);
	int res=m.sum(10,20);
	
	System.out.println("The sum is "+res);

	maths m2=(x,y)->{System.out.println("The sum is " +(x+y));
	return x;};
	m2.sum(20,20);
}
}
