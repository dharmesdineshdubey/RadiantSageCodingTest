
public class SingletonClassExample {
	private static Singleton s = null;   
	   
	public String str;   
	
	private Singleton()   
	{   
	str = "it is an example of singleton class";   
	}   
  
	public static Singleton getInstance()   
	{   
	 
	if (s== null)   
	s = new SingletonClassExample();   
	return s;   
	}   

}
