package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;

public class MapIntegerDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		System.out.println("Input list:");
		input.forEach(num -> System.out.println(num));
		System.out.println("Squared list:");
		input.stream().map(num -> num*num).forEach(num -> System.out.println(num));
		

	}

}
