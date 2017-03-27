package AdapterPattern;

public class TestDemo 
{
	public static void main(String[] arg)
	{
		turkeyAdapter turkey = new turkeyAdapter(new RedheadDuck());
		
		turkey.gobble();
		
		turkey.fly();
		
	}
}