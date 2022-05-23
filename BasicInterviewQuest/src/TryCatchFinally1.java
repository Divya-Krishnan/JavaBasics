
public class TryCatchFinally1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Try");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Out");
	}

}
