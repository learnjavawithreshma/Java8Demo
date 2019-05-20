package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStreamDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
		distinctList.forEach(num -> System.out.println(num));
	}

}
