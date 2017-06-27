package Prototype;

public class CloneFactory {
	
	public Card cloneCard(Card newCard){
		return newCard.makeCopy();
	}
	
}
