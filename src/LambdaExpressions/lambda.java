package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class lambda {

	public static void main(String[] args) {
//		This lambda expression is introduced in java8-(1.8) (2014)
//		in java 1.2 Collection API
//		in java 1.5 Generics API 
//		in java 1.8 lambda expressions
//		Before understanding the lambda lets us try to understand functional interface
//		Marker Interface which does not have any methods
//		Functional Interface which have only one method (prior to java8 it is called SAM (Single Abstract Method)) 
//		most of the interfaces in java are functional interfaces
		
		
//		A a = new A(); the below line is invalid because A is interface
		A a = new B();
//		the above line works fine because we are instatiating the object of B
//		lets say since the compiler already knows that A is an interface so what it will do it is , it will complete the remanining code 
		A a1 = new A() {
			public void show() {
				System.out.println("This is the show method in A interface");
			}
		};
//		The above class is anonymous class because it does not have any name to it
//		the above code is way we used to code before java8 
		
//		now after lambda expressions got release in java8 we use the below approach
		
		A a2 = () -> {System.out.println("This is way to do it through lambda expressions");};
		
//		(parameters) - > expression 
		
		
//		Now below we will deal with complete different way
		
		Operator <Integer> opertoradd = (j, b) -> {System.out.println(j+b);};
		opertoradd.process(3, 3);
		
		Operator <String> operatorConcatenate = (s1, s2) -> {System.out.println(s1+s2);};
		operatorConcatenate.process("Rohith", "Reddy");
		
//		 lambda expression can have multiple parameters
//		(x,y) -> x+y;
//		(x,y,z) -> x+y+z;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.forEach((x) -> System.out.println(x));
		
	}
}
