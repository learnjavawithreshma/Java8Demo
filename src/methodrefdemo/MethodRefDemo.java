package methodrefdemo;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple","Orange","Mango","Banana");
		strList.forEach(String::toUpperCase);
	}

}
