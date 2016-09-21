package WorksApp.BootcampSS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		List<Integer> xs = Arrays.asList(3,4,2,5,1); 
		xs.sort(new Comparator<Integer>(){ 
			@Override
			public int compare(Integer o1,Integer o2)
			{ 
				return o2-o1;} 
			});
		System.out.println(xs);
		
		Arrays.asList("Apple","Orange","Lemon","Peach","Lime")
		.stream()
		.filter(s -> s.length() == 5) 
		.filter(s -> s.startsWith("A")) 
		.map(String::toLowerCase) 
		.forEach(System.out::println);
//		.forEach(s -> System.out.println(s));
		
//		Integer x = new Integer(1);
//		
//		String xStr = ( x == null ? null : x.toString());
//		String xStr = Objects.toString(x, null);
//		
//		System.out.println(xStr);
		
//		List<Integer> xxs = Collections.emptyList();
//		xxs.add(new Integer(100));
////		xxs.add(10);
//		System.out.println(xxs);
		
//		SortedMap<Integer,List<Integer>> map = Arrays.asList(1,2,3).stream() 
//			.collect(Collectors.groupingBy(
//				x -> x % 2,
//				TreeMap::new,
//				Collectors.mapping(x -> x * 3,Collectors.toList())
//			)); 
//				System.out.println(map);
		
		Arrays.<Supplier<String>>asList( 
			() -> "Hello",
			() -> ", ",
			() -> "world" 
			).forEach( x -> System.out.print(x.get()));

		Consumer<String> _ = System.out::println;
		
		int x = 10;
		Arrays.asList(10,20,30).stream()
		.map(y -> x+y) 
		.filter(y -> y > 20) 
		.forEach(System.out::println);
				
	}
}
