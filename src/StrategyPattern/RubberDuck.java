package StrategyPattern;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		flybehave = new flyNoWay();
		quackbehave = new squeakDuck();
	}
	
	//display method overide parent display method
	public void display(){
		System.out.println("I am a rubber duck!");
	}
	
	public static void main(String[] arg){
		
		Duck rd = new RubberDuck();
		rd.display();
		rd.performFly();
		rd.performQuack();
		
	}
}