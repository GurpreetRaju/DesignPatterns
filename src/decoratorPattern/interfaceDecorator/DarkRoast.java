package decoratorPattern.interfaceDecorator;

public class DarkRoast implements Beverage
{
	String description = "Unknown";
	int price = 0;
	
	public DarkRoast(){
		description = "This coffee is dark roast";
		price = 99;
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