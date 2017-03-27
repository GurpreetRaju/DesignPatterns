package AdapterPattern;

public class RedheadDuck implements Duck{
	
	public RedheadDuck(){}
	
	//display method for RedheadDuck overrides parent duck
	public void fly(){
		System.out.println("I am flying!");
	}
	public void quack(){
		System.out.println("Quack!");
	}
	
	public static void main(String[] arg){
		
		Duck rd = new RedheadDuck();
		rd.quack();
		rd.fly();
	}
	
}