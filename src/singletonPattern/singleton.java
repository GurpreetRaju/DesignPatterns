package singletonPattern;

public class singleton{
	
	private static singleton instance = null;
	
	private singleton(){
		if(instance != null)
		{
			System.out.println("Instance already instantiated");			
		}
	}
	
	public static singleton getInstance()
	{
		if(instance == null)
		{
			instance = new singleton();			
		}
		
		return instance;
	}
	
	public void display()
	{
		System.out.println("Hello this is Singleton instance display method!");
	}
}