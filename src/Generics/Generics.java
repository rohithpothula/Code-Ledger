package Generics;

public class Generics {

	public static void main(String[] args) {
		IntegerPrinter numberPrinter = new IntegerPrinter();
		numberPrinter.setData(5);
		StringPrinter stringPrinter = new StringPrinter();
		stringPrinter.setData("Rohith");
//		generics has been introduced in java5
//		here we want to print the data with same printer since we had two data types 
//		we had to create two classes 
//		if we use generics class then there will be no need to creat ethe IntegerPrinter and StringPrinter
		GenericsPrinter<Integer> genericsPrinter = new GenericsPrinter<Integer>(2);
//		genericsPrinter.setData(2);
		GenericsPrinter<String> genericsPrinter2 = new GenericsPrinter<String>("Rohith");
//		genericsPrinter2.setData("Rohith");
//		see with the help of generics we are able to create the two different types of printers which prints different types of data
//		creation of generics class with two different types is also possible
		GenericsPrinter2<String,Integer> genericsPrinter22 = new GenericsPrinter2<String, Integer>("Rohith", 22);
		
		Cat cat = new Cat("Puppy", "white", 22);
		AnimalPrinter<Cat> animalPrinter = new AnimalPrinter<Cat>(cat);
//		here in the animal printer can take objects which extends only Animal class if others were sent then there will be error 
		
	}

}
