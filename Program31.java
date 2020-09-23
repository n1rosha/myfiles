class Program31
{
static
     {
     System.out.println("STRING METHOD");
	 }
public static void main(String args[])
   {  //CAPACITY & LENGTH BEFORE STRING 
	  StringBuffer sb1=new StringBuffer();
	  System.out.println("String="+sb1);
	  System.out.println("Capacity:"+sb1.capacity());
      System.out.println("Length="+sb1.length());
	  //CAPACITY & LENGTH AFTER STRING
	  StringBuffer sb=new StringBuffer("Hello");
      System.out.println("String:"+sb);
	  System.out.println("Capacity:"+sb.capacity());
      System.out.println("Length="+sb.length());
      //APPEND
	  sb.append("!");
      System.out.println(sb);
      sb.insert(6,"Tom");
      System.out.println(sb);
      sb.replace(6,9,"Raj");
      System.out.println(sb);	  
	  sb.delete(0,5);
      System.out.println(sb);
	  sb.reverse();
      System.out.println(sb);
   }
}