import java.util.Scanner;

class Customer
{
	private String name;
	private String address;
	private int age;
	private String mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	void displayCustomer()
	{
		System.out.println("Name "+name);
		System.out.println("Mobile Number "+mobileNumber);
		
		System.out.println("Age "+age);
		System.out.println("Address "+ address);
		
	}
	
}
class SeniorCitizenCustomer extends Customer
{
	double generateBillAmount(int amount)
	{
		double bill=amount-((amount*12)/100);
		return bill;
		
	}
}
class PrivilegeCustomer extends Customer
{
	double generateBillAmount(int amount)
	{
		double bill=amount-((amount*30)/100);
		return bill;
		
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1) Privilege Customer \n 2)SeniorCitizenCustomer");
		System.out.println("Enter Customer Type");
		switch(sc.nextInt())
		{
		case 2:
			
		
		SeniorCitizenCustomer scc=new SeniorCitizenCustomer();
		System.out.println("Enter the Name ");
		scc.setName(sc.next());
		System.out.println("Enter the Age ");
		scc.setAge(sc.nextInt());
		System.out.println("Enter the Address ");
		scc.setAddress(sc.next());
		System.out.println("Enter the Mobile Number ");
		scc.setMobileNumber(sc.next());
		System.out.println("Enter the Purchased Amount ");
		int billAmt=sc.nextInt();
		double bill=scc.generateBillAmount(billAmt);
		System.out.println("Bill Details ");
		
		scc.displayCustomer();
		System.out.println("Your bill amount is Rs "+billAmt+" Your bill amount is discount under SeniorCitizen customer\n"
				+ "You have to pay Rs "+bill);
		break;
	
		case 1:
		
			PrivilegeCustomer pc=new PrivilegeCustomer();
			System.out.println("Enter the Name ");
			pc.setName(sc.next());
			System.out.println("Enter the Age ");
			pc.setAge(sc.nextInt());
			System.out.println("Enter the Address ");
			pc.setAddress(sc.next());
			System.out.println("Enter the Mobile Number ");
			pc.setMobileNumber(sc.next());
			System.out.println("Enter the Purchased Amount ");
			int billAmt1=sc.nextInt();
			double bill1=pc.generateBillAmount(billAmt1);
			System.out.println("Bill Details ");
			
			pc.displayCustomer();
			System.out.println("Your bill amount is Rs "+billAmt1+" Your bill amount is discount under SeniorCitizen customer\n"
					+ "You have to pay Rs "+bill1);
		
			break;
			default:
				System.out.println("Invalid Customer Type");
			
}
	}
}

	
