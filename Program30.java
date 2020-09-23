import java.util.*;
class Program30
{
static
     {
     System.out.println("STRING METHOD");
	 }
static String UN,PS;
static Scanner s1=new Scanner(System.in);
public static void main(String args[])
   {
System.out.print("Enter the Username:");
UN=s1.nextLine();
System.out.print("Enter the Password:");
PS=s1.nextLine();
if(UN.compareTo("admin")==0)
{
if(PS.compareToIgnoreCase("admin")==0)
{
System.out.println("WELCOME");	
}	
else
{
System.out.println("Password is incorrect:(");	
	
}
}
else
{
System.out.println("Username is incorrect:(");	
	
}
       
   }
}