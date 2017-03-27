package StrategyPattern;

public class muteDuck implements quackBehavior{

	public void quack(){
		System.out.println("I can't Quack!");
	}

}