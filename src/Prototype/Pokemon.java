package Prototype;

public class Pokemon implements Card{
	
	private String name;
	
	public Pokemon(String newName){
		this.name = newName;
	}
	
	public Card makeCopy(){
		
		Pokemon clonedPokemon = null;
		
		try {
			clonedPokemon = (Pokemon) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clonedPokemon;
	}
	
	public String toString(){
		return "Card name: "+this.name;
	}
	
}
