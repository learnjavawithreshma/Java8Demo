package learnjava.functionalinterfacesdemo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> startsWithHello = (str) -> str.startsWith("Hello");
		System.out.println("Hello World starts with Hello = "+startsWithHello.test("Hello World"));
		System.out.println("Test String starts with Hello = "+startsWithHello.test("Test String"));

	}
	//Predicate<Integer> greaterThan8 = (input) -> input > 8;
	//System.out.println("4 is greater than 8 = "+greaterThan8.test(4));
	//System.out.println("12 is greater than 8 = "+greaterThan8.test(12));

}



