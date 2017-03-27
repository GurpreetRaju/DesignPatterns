package decoratorPattern.interfaceDecorator;

public class Mocha extends BeverageDecorator
{
	public Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription()
	{
		return beverage.getDescription() + ", Mocha";
	}
	
	public int getPrice()
	{
		return beverage.getPrice() + 10;
	}
	
}