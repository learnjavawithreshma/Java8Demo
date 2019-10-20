package learnjava.collectionimporvements;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentDemo {

	public static void main(String[] args) {
		Map<String, Integer> fruitsLengthMap = new HashMap<String, Integer>();
		fruitsLengthMap.put("apple", 5);
		fruitsLengthMap.put("strawberry", 10);

		String banana = "banana";

		fruitsLengthMap.computeIfAbsent(banana, key -> key.length());
		System.out.println(fruitsLengthMap.get(banana));
	}
}
