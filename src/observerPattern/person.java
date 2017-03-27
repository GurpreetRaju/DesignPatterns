package observerPattern;

public class person extends observer
{
	public void oPrice(int price){
		oprice = price;
		System.out.println("Price changed and notified to observer " + oprice);
	}
}