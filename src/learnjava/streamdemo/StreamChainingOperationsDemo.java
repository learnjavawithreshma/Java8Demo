package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamChainingOperationsDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		long count = input.stream().filter(num -> num >= 9).distinct().count();
		System.out.println("count ="+count);

	}

}
