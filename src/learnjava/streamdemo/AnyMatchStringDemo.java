package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AnyMatchStringDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","Orange","Mango","Banana");
		boolean anyMatch = strList.stream().anyMatch( str -> str.startsWith("S"));
		System.out.println("Fruit starting with S present: "+anyMatch);

	}

}
