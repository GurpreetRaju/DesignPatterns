package decoratorPattern;

public class DarkRoast extends Beverage
{
	
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