import java.util.Scanner;

class IPL {
String TeamName;
int Won;
int Lost;
int Tied;
int Points;
public IPL(String teamName, int won, int lost,int tied, int points) {
	super();
	TeamName = teamName;
	Won = won;
	Lost = lost;
	Tied=tied;
	Points = points;
}
void search(String teamName, String searchKey)
{
	if(searchKey.equals("W"))
	{
		System.out.println(Won);
	}
	else if (searchKey.equals("L"))
	{
		System.out.println(Lost);
	}
	else if (searchKey.equals("T"))
	{
		System.out.println(Tied);
	}
	else if (searchKey.equals("P"))
	{
		System.out.println(Points);
	}
	else
	{
		
	}
}
}
public class TestIPL {

	public static void main(String[] args) {
		IPL[] ipl=new IPL[8];
		ipl[0]=new IPL("DC",10,4,0,20);
		ipl[1]=new IPL("CSK",9,5,0,18);
		ipl[2]=new IPL("RCB",9,5,0,18);
		ipl[3]=new IPL("KKR",7,7,0,14);
		ipl[4]=new IPL("MI",7,7,0,14);
		ipl[5]=new IPL("PBKS",6,8,0,12);
		ipl[6]=new IPL("RR",5,9,0,10);
		ipl[7]=new IPL("SRH",3,11,0,6);
		Scanner sc=new Scanner(System.in);
		String teamName=sc.next();
		String searchKey=sc.next();
		for(int i=0;i<ipl.length;i++)
		{
		if(teamName.equals(ipl[i].TeamName))
		{
			String name=ipl[i].TeamName;
			ipl[i].search(name, searchKey);
		}
			
		}
		
	}

}
