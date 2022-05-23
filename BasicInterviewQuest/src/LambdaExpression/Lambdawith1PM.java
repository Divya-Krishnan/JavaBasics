package LambdaExpression;

interface onePm
{
	public int number(int num);
}
public class Lambdawith1PM {

	public static void main(String[] args) {
		
		onePm obj=(value)->{return value;};
		
		System.out.println(obj.number(21));
		
	}
}
