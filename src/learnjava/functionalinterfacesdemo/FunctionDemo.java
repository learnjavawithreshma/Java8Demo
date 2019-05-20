package learnjava.functionalinterfacesdemo;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String,Integer> lengthChecker = (str) -> {return str.length();};
		String input = "Hello World";
		System.out.println("Length of "+input+" is "+lengthChecker.apply(input) );
		input = "Test";
		System.out.println("Length of "+input+" is "+lengthChecker.apply(input) );

	}

}
