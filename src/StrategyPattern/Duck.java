package StrategyPattern;

public abstract class Duck{
	
	public flyBehavior flybehave;
	public quackBehavior quackbehave;
	
	/* Abstract method Display to show the type of duck*/
	abstract void display();
	
	//Quack behaviour of duck
	public void performQuack(){
		quackbehave.quack();
	}
	
	//Fly behaviour of duck
	public void performFly(){
		flybehave.fly();
		//System.out.println("Hello! Test");
	}
}