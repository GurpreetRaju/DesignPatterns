package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class subject {
	
	private int price = 0;
	private List<observer> observers = new ArrayList<observer>(); 
	
	public subject(){}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int o)
	{
		this.price = o;
		notifyObserver();
	}
	
	private void notifyObserver()
	{
		for(observer obs: observers)
		{
			obs.oPrice(price);
		}
	}
	
	public void addObserver(observer o)
	{
		observers.add(o);
	}
	
	public static void main(String[] arg)
	{
		subject sbj = new subject();
		
		observer gurpreet = new person();
		observer jashan = new person();
		
		sbj.addObserver(gurpreet);
		sbj.addObserver(jashan);
		
		sbj.setPrice(200);
	}

}