package learnjava.streamdemo;

import java.util.Arrays;
import java.util.List;

public class AllMatchStringDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Monday","Sunday","Wednesday");
		boolean allMatch = strList.stream().allMatch( str -> str.endsWith("day"));
		System.out.println("All days of the week: "+allMatch);

	}

}
