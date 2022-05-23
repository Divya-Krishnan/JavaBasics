import java.util.Scanner;

public class largestNo{  

  
public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
//System.out.println("Enter length");
int length=sc.nextInt();
int arr[]=new int[length];
for(int i=0;i<length;i++)
{
	//System.out.println("Enter No.");
	arr[i]=sc.nextInt();
}
//System.out.println("Enter nth No");
int large=sc.nextInt();
int temp;
for (int i = 0; i < arr.length; i++)   
{  
    for (int j = i + 1; j < arr.length; j++)   
    {  
        if (arr[i] > arr[j])   
        {  
            temp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = temp;  
        }  
    }  
}  
System.out.println(arr[arr.length-large]); 
  
}}  