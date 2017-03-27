package decoratorPattern;

public class Mocha extends BeverageDecorator
{
	public Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription()
	{
		return beverage.description + ", Mocha";
	}
	
	public int getPrice()
	{
		return beverage.price + 10;
	}
	
}