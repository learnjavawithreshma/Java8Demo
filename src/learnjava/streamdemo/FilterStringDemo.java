package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStringDemo {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","Orange","Mango","Banana");
		Stream<String> filteredStream = strList.stream().filter( str -> str.startsWith("M"));
		filteredStream.forEach(str -> System.out.println(str));

	}
}
