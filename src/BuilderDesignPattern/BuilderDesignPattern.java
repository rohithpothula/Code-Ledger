package BuilderDesignPattern;

public class BuilderDesignPattern {

	public static void main(String[] args) {

//		creational Design Pattern
//		the uses of builder design pattern 
//		it mainly helps in creating the complex objects 
//		it seperates the creation of objects from its state 
//		https://www.baeldung.com/java-builder-pattern
		
//		here is a thing to observe the object created with builder design pattern can be mutable and we can make it immutable also 
//		in the user class we can remove the final from the fields and add setters so we can make it mutable also 
//		but what happens with this is it conflicts core idea of speration of creating object from its representation 
		
//		immutability helps with thread safety and 
		
		
		
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder.setAddress("bangalore").build();
//		see here an can be created only with some of its variables not all variables needs to be declared 
		User user1 = userBuilder.setFirstName("Rohith").setAge("25").setEmail("rohith@gmai.com").build();
		System.out.println(user1.toString());
	}

}
