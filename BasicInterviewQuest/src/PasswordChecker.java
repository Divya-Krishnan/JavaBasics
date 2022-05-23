import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PasswordChecker { 
String password;
private void setPassword(String pass) {
	password=pass;
	
}

public void passwordChecker() {
	boolean isValid = true;
    if (password.length() > 15 || password.length() < 8)
    {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
    }
    String upperCaseChars = "(.*[A-Z].*)";
    if (!password.matches(upperCaseChars ))
    {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
    }
    String lowerCaseChars = "(.*[a-z].*)";
    if (!password.matches(lowerCaseChars ))
    {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
    }
    String numbers = "(.*[0-9].*)";
    if (!password.matches(numbers ))
    {
            System.out.println("Password must have atleast one number");
            isValid = false;
    }
    String specialChars = "(.*[@,$].*$)";
    if (!password.matches(specialChars ))
    {
            System.out.println("Password must have atleast one special character among @#$%");
            isValid = false;
    }
    if(isValid)
    	{
    	System.out.println("Valid");
    	}
    else
    {
    	System.out.println("Invalid");
    
}
}






    public static void main(String args[])
    {
  
       
Scanner sc=new Scanner(System.in);
System.out.println("Enter PAss");
String pass=sc.next();

PasswordChecker pc=new PasswordChecker();
pc.setPassword(pass);
pc.passwordChecker();


    }

	
}