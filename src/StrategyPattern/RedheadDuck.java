package StrategyPattern;

public class RedheadDuck extends Duck{
	
	public RedheadDuck(){
		flybehave = new flyWithWings();
		quackbehave = new quackDuck();
	}
	
	//display method for RedheadDuck overrides parent duck
	public void display(){
		System.out.println("I am a Redhead Duck!");
	}
	
	public static void main(String[] arg){
		
		Duck rd = new RedheadDuck();
		rd.display();
		rd.performFly();
		rd.performQuack();
		
	}
	
}