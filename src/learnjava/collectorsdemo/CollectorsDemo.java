package learnjava.collectorsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		
		long count = list.stream().collect(Collectors.counting());
		
		System.out.println("Count:"+count);
		
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

	}

}
