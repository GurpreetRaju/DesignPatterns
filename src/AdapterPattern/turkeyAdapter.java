package AdapterPattern;

public class turkeyAdapter implements Turkey
{
	Duck duck;
	
	
	public turkeyAdapter(Duck duck)
	{
		this.duck = duck;
	}
	
	public void fly()
	{
		duck.fly();
	}
	public void gobble()
	{
		duck.quack();
	}
}