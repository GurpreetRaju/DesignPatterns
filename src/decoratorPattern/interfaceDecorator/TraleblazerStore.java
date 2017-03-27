package decoratorPattern.interfaceDecorator;

public class TraleblazerStore{
	public static void main(String[] arg)
	{
		Beverage beverage = new Mocha(new DarkRoast());
		System.out.println((beverage).getDescription());
		System.out.println("Price: "+ beverage.getPrice() + " cents");
	}
}