package AdapterPattern;

public class WildTurkey implements Turkey{
	public void gobble(){
		System.out.println("Gobble Gobble!!");
	}
	public void fly(){
		System.out.println("I fly a short distance!!");
	}
	
	public static void main(String[] arg)
	{
		Turkey tk = new WildTurkey();
		tk.gobble();
		tk.fly();
	}
}