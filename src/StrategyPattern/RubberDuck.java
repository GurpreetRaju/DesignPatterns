package StrategyPattern;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		flybehave = new flyNoWay();
		quackbehave = new squeakDuck();
	}
	
	public void changeFlyBehavior(flyBehavior newfly){
		this.flybehave = newfly;
	}
	//display method overide parent display method
	public void display(){
		System.out.println("I am a rubber duck!");
	}
	
	public void fly(){
		System.out.println("I can't fly!");
	}
	
	public static void main(String[] arg){
		
		Duck rd = new RubberDuck();
		rd.display();
		((RubberDuck) rd).fly();
		rd.performQuack();
//		((RubberDuck) rd).changeFlyBehavior(new flyWithWings());
//		rd.performFly();
	}
}