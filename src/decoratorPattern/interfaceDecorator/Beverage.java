package decoratorPattern.interfaceDecorator;

public interface Beverage
{
	String description = "Unknown";
	int price = 0;
	
	public String getDescription();
	
	public int getPrice();
	
}