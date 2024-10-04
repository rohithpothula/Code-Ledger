package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

//		Arrays is a utility class which helps in providing the operations done on the Array eg: Arrays.sort, Arrays.binarysearch , Arrays.toString
//		where as the array is general array data structure as we know 
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
//		numbers.stream().filter(n -> n%2!=0).forEach(x -> System.out.println(x));
//		numbers.stream().filter(n -> n%2==0).forEach(x -> System.out.println(x));
//		System.out.println(evenNumbers);

//		ways to create Streams
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		stream.forEach(x -> System.out.println(x));

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream1 = list.stream();
//		stream.forEachOrdered(x -> System.out.println(x));

		Stream<Integer> stream3 = Stream.generate(() -> (new Random().nextInt(100)));

		stream3.limit(2).forEach(x -> System.out.println(x));

//		collect to list 
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		Stream<Integer> stream2 = list1.stream();
//		List<Integer> evennumberlist2 = stream2.filter(y -> y%2==0).collect(Collectors.toList());

		Integer[] numbers1 = stream2.filter(n -> n % 2 != 0).toArray(Integer[]::new);

		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Rohith");
		memberNames.add("Shiva");
		memberNames.add("Kumar");
		memberNames.add("Nagi");
		memberNames.add("Reddy");
		memberNames.add("Nagesh");
		memberNames.add("Suvarna");
		memberNames.add("prakash");
		Stream<String> memberStream = memberNames.stream();
		String s = "asdfsadf";
//		memberStream.filter(result -> result.startsWith("R")).forEach(x -> System.out.println(x));
//		memberStream.map(String::toUpperCase).forEach(x->System.out.println(x));
//		long n = memberStream.sorted().filter(result -> result.endsWith("h")).count();
//		System.out.println(n);

//		boolean result1 = memberStream.anyMatch(result -> result.endsWith("h"));
//		System.out.println(result1);
//		boolean result2 = memberStream.allMatch(result -> result.endsWith("i"));
//		System.out.println(result2);
//		boolean result3 = memberStream.noneMatch(result ->result.contains("d"));
//		System.out.println(result3);

//		Optional <String> opResult = memberStream.reduce((s1,s2) -> s1 + "#" + s2);
//		String result4 = opResult.get();
//		System.out.println(result4);

//		memberStream.anyMatch((result) -> result.startsWith("N"));
		String result6 = memberStream.filter(result -> result.startsWith("N")).findFirst().get();
		System.out.println(result6);
		
//		This example is not related to streams but it worthy to know about it 
		Integer a = 11;
		Integer b = 11;
		Integer c = 2000;
		Integer d = 2000;
//		Expectation is true and output is also true
		System.out.println(a==b); 
//		Expectation is true but the output is false
		System.out.println(c==d);
//		The reason for the above behaviour is because of object caching in java 
//		generally the number from -127 to 128 are very much frequently used in java
//		in order to increase the performace When a object is created with this value ranging from -127 to 128 
//		the reference will be redirected to same object 
//		and if the value is out of this range then new object will be created 
		Integer a1 = new Integer(1000);
		Integer b1 = new Integer(1000);
		System.out.println(a1==b1);
		
		
//		find the smallest element in list through streams
		List<Integer> list3 = new ArrayList<>();
		list3.add(222);
		list3.add(23);
		list3.add(297);
		list3.add(2);
		list3.add(79);
		list3.add(98);
		list3.add(100);
		Optional<Integer> x = list3.stream().sorted((l,m)->{return m-l;}).skip(1).limit(1).findFirst();
//		the above statement will find the second largest or second smallest element based 
//		on the sorting order that we give in the sorted function 
		System.out.println(x);
	}

}
