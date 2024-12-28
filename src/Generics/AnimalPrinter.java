package Generics;

public class AnimalPrinter <T extends Animal>{
	
	private T animalData;
	
	public AnimalPrinter(T animalData) {
		this.animalData=animalData;
	}

}
