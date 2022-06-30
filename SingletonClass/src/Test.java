
public class Test {
	public static void main(String args[])   
	{   
	   
	SingletonClassExample a = SingletonClassExample.getInstance();   
	   
	SingletonClassExample b = SingletonClassExample.getInstance();   
	
	SingletonClassExample c = SingletonClassExample.getInstance();   
  
	a.str = (a.str).toUpperCase();   
	System.out.println("String from a is " + a.str);   
	System.out.println("String from b is " + b.str);   
	System.out.println("String from c is " + c.str);   
	}   
	   
	
}
