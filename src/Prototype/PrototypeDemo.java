package Prototype;

public class PrototypeDemo {

	public static void main(String[] srg){
		
		CloneFactory clonemaker = new CloneFactory();
		Card pokemon = new Pokemon("Pikachu");
		
		Card clonedPikachu = clonemaker.cloneCard(pokemon);
		
		System.out.println(pokemon+" Hashcode: "+System.identityHashCode(pokemon));
		System.out.println(clonedPikachu+" Hashcode: "+System.identityHashCode(clonedPikachu));
		
		Card trainer = new Trainer("Red Card");
		
		Card clonedRed = clonemaker.cloneCard(trainer);
		
		System.out.println(trainer+" Hashcode: "+System.identityHashCode(trainer));
		System.out.println(clonedRed+" Hashcode: "+System.identityHashCode(clonedRed));
		
	}
	
}
