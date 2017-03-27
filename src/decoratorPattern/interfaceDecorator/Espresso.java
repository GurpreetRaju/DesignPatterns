package decoratorPattern.interfaceDecorator;

public class Espresso implements Beverage
{
	String description = "Unknown";
	int price = 0;
	
	public Espresso(){
		
		description = "This coffee is espresso";
		price = 95;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getPrice()
	{
		return price;
	}
	
}