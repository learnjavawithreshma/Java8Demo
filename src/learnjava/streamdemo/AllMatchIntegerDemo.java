package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AllMatchIntegerDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		boolean found = input.stream().allMatch(num -> num % 2 == 0);
		System.out.println("All even numbers: "+found);

	}

}
