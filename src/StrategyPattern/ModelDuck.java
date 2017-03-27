package StrategyPattern;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		flybehave = new flyNoWay();
		quackbehave = new muteDuck();
	}
	
	//display method for ModelDuck override parent display method
	public void display(){
		System.out.println("I am a model duck!!");
	}
	
	public static void main(String[] arg){
		
		Duck md = new ModelDuck();
		md.display();
		md.performFly();
		md.performQuack();
		
	}

}