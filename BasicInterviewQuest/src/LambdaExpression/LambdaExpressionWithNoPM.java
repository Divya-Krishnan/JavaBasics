package LambdaExpression;

interface Print
{
	public void disp();
}
public class LambdaExpressionWithNoPM {
public static void main(String[] args) {
	

	String s="Divya";
	Print print=()->{System.out.println(s);};
	print.disp();
}
}