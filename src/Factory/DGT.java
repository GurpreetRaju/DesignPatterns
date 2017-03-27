package Factory;

import java.util.Scanner;

public class DGT{
	
	public static void main(String[] arg)
	{	
		Scanner reader = new Scanner(System.in);
		demandFactory ofactory = new demandFactory();
		int otype;
		System.out.println("1. Shopping \n2. Restaurant \nEnter the demand type number (1 or 2) to generate:");
		
		otype = reader.nextInt();
		
		Demand pDemand = ofactory.oDemand(otype);
		pDemand.display();
		
		reader.close();
	}

}