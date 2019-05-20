package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AnyMatchIntegerDemo {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		boolean found = input.stream().anyMatch(num -> num > 9);
		System.out.println("number > 9 "+found);
	}
}
