class Program29
{
static
     {
     System.out.println("STRING METHOD");
	 }
public static void main(String args[])
   {
	   String s1="hello";
	   String s2="world";
	   
	   String s3=s1+s2;
	   System.out.println(s3);
	   //CONCAT WITH ARG
	   String s4=s1.concat(s2);
	   System.out.println(s4);
	   //TOUPPER CASE
	   String strupr=s4.toUpperCase();
	   System.out.println(strupr);
	   //TOLOWER CASE
	    String strlwr=s4.toLowerCase();
	   System.out.println(strlwr);
       //REPLACE
	    String str="HEllo!ram";
	   	System.out.println(str);
		String str2=str.replace("ram","tom");
        System.out.println(str2);
		

   }
}