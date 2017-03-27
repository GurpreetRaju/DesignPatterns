package decoratorPattern;

public class Espresso extends Beverage
{
	
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