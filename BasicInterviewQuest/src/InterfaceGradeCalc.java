import java.util.Scanner;

interface weighGrade
{
	int sportsweightage=10;
	
	public String Grade(int m1,int m2, int m3,String sports);
	
}
class details implements weighGrade
{

	@Override
	public String Grade(int m1, int m2, int m3, String sports) {
		String grade;
		int total;
		if(sports.toLowerCase().equals("involved"))
		{
			total=( ((m1+m2+m3)/3) + sportsweightage) ;
			
		}
		else
		{
			total=( (m1+m2+m3)/3);
		}
		
		if(total >80)
		{
			grade="Grade A";
			System.out.println("Total : "+total);
		}
		else
		{
			grade="Grade B";
			System.out.println("Total : "+total);
		}
		return grade;
	}

	
	
	
}
public class InterfaceGradeCalc {

	public static void main(String[] args) {
		details det=new details();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String sports =sc.next();
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		
		
		String result=det.Grade(mark1,mark2,mark3,sports);
		System.out.println("Name : "+name);
		System.out.println("Grade : "+result);

	}

}
