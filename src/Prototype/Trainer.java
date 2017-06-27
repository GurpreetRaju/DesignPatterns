package Prototype;

public class Trainer implements Card{

	private String name;
	
	public Trainer(String newName){
		this.name = newName;
	}
	
	@Override
	public Card makeCopy() {
		Trainer clonedTrainer = null;
		
		try {
			clonedTrainer = (Trainer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clonedTrainer;
	}

	public String toString(){
		return "Card name: "+this.name;
	}
	
}
