package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.security.SecureRandom;
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
		
		Predicate<Integer> isEven = (n) -> n%2==0;
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		List<Integer> list3 = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
		
//		Stream<Integer> stream1 = list.stream();
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
		List<Integer> list31 = new ArrayList<>();
		list3.add(222);
		list3.add(23);
		list3.add(297);
		list3.add(2);
		list3.add(79);
		list3.add(98);
		list3.add(100);
//		Optional<Integer> x = list3.stream().sorted((l,m)->{return m-l;}).skip(1).limit(1).findFirst();
		Optional<Integer> y = list3.stream().sorted().skip(1).limit(1).findFirst();
//		the above statement will find the second largest or second smallest element based 
//		on the sorting order that we give in the sorted function 
		System.out.println(y);
		
		List <Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee("Rohith", "Reddy", 90000000, "rohith@gmail.com");
		Employee e2 = new Employee("shiva", "Reddy", 999000, "shiva@gmail.com");
		Employee e3 = new Employee("prakash", "Reddy", 99000, "prakash@gmail.com");
		Employee e4 = new Employee("maitrayee", "Reddy", 99000, "maitrayee@gmail.com");
		Employee e5 = new Employee("nagesh", "Reddy", 99999000, "nagesh@gmail.com");
		Employee e6 = new Employee("Rohith", "Reddy", 900000099, "rohith@gmail.com");
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		
//		order the employees based on salary and then based on employee first name and then the reverse -- just kept on adding the filtering to know about stuff 
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getFirstName).reversed()).forEach(e -> System.out.println(e.getFirstName()));
//		find an empployee who name is Rohith and among those find the largest salary
		employeeList.stream().filter(e -> "Rohith".equals(e.getFirstName())).max(Comparator.comparing(Employee::getSalary)).ifPresent(e -> System.out.println(e.getFirstName()+" "+e.getSalary()));
		
//		Optional<Employee> list11 = employeeList.stream().filter(m -> m.getFirstName().contains("h")).toList();
		
//		https://rathod-ajay.medium.com/top-30-java-8-interview-questions-answers-to-ace-your-java-interview-includes-coding-questions-d19fbd4510cd
//		the above is very good article for streams java questions to practice	
			
			
//	find the avarage of salary of all employess           // todo
//		employeeList.stream().collect(Collectors.)


//		        String url = "jdbc:sqlserver://BLRLB80H6G3:1433;instanceName=SA;DatabaseName=QNBV5;encrypt=true;trustServerCertificate=true;";
//		        try {
//		            Connection conn = DriverManager.getConnection(url);
//		            System.out.println("Connection successful!");
//		        } catch (SQLException e) {
//		            e.printStackTrace();
//		        }
		        
//		        SecureRandom random = new SecureRandom();
////		        byte[] salt = new byte[16]; // 16 bytes = 128 bits
//		        byte[] salt = new byte[16]; // 16 bytes = 128 bits
//		        random.nextBytes(salt);
//		        String saltValue = Hex.encodeHexString(salt);
//		        System.out.println("Generated Salt: " + saltValue);
		
		
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Shiva");
		map.put(2,"ROhtih");
		
		Map<Integer,String> map_con = new ConcurrentHashMap<Integer,String>();
		map_con.put(2, "skjdfh");
		map_con.put(4, "kkkk");
		
//		map_con.put(6, null);
		
		List<Integer> IntegerList = Arrays.asList(11,20,30,40);
		
		IntegerList.stream().filter(n-> n%2==0).map(n-> n*n).collect(Collectors.toList()).forEach(x-> System.out.println(x));
		
		List<String> listof_Strings = Arrays.asList("Rohith","Shiva","Ram","Ram","Ram");
		Stream<String>  streamers= listof_Strings.stream().filter((String val) -> val.length()<=3).peek((String val) -> System.out.println(val));
		
		
//		Intermediate Operations are lazy operations
		System.out.println("***********");
		long c1 = streamers.count();
		System.out.print(c1);
		
		
		List<Integer> numbers3 = Arrays.asList(1,2,3,4,5,6,7,8);
		numbers3.stream().filter((Integer n) -> n%2==0)
						.peek((Integer n) -> System.out.println("After Filter :" + n))
						.map((Integer n) -> n*n)
						.peek((Integer n) -> System.out.println("After map :" + n))
						.sorted(Comparator.reverseOrder())
						.peek((Integer n) -> System.out.println("After Sorted "+n));
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int n = nums.length;
		Map<Integer,Integer> m = new ConcurrentHashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			if(m.containsKey(nums[i])) {
				m.put(nums[i], m.get(nums[i]));
			}
			else {
				m.put(nums[i], 1);
			}
		}
		int k = 0;
		Map <Integer,Integer> m1 = Collections.synchronizedMap(new HashMap<>());
		
		int ans = 0;
		for(Map.Entry<Integer, Integer> map_entry : m.entrySet()) {
			int temp_key_1 = map_entry.getKey();
			int temp_key_2 = k-temp_key_1;
			if(temp_key_1!=temp_key_2) {
			    int value = m.get(temp_key_2) == null ? 0 : m.get(temp_key_2);
				ans = ans + Math.min(value, map_entry.getValue());
			}
			else {
				int value = m.get(temp_key_2) == null ? 0 : m.get(temp_key_2);
				ans = ans + Math.min(map_entry.getValue(), m.get(temp_key_2))/2;
			}
			map_entry.setValue(0);
		}
		
		
	}

}
