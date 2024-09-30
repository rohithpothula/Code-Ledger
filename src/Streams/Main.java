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
	}

}
