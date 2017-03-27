package Factory;

public class demandFactory{
	public Demand oDemand(int type){
	
		switch(type)
		{
			case 1:
				return new restaurantDemand();
				
			case 2:
				return new shoppingDemand();
				
			default:
				return null;
		}
	}
}