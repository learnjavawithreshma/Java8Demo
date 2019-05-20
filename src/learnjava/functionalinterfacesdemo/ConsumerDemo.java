package learnjava.functionalinterfacesdemo;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Reshma Bidikar
 *
 */
public class ConsumerDemo {
	
	//
//	public static void main(String args[]){
//		Consumer<Integer> squareGenerator = (input) -> System.out.println("Square of "+input +" is "+(input*input));
//		squareGenerator.accept(6);
//	}
//
//}
//
	
	public static void main(String args[]) {
		Consumer<String> subStringGenerator = (str) -> System.out.println(str.substring(0, 5));
		String input = "Hello World test";
		Consumer<String> subString = subStringGenerator.andThen(subStringGenerator);
		subString.accept(input);
		// subStringGenerator.accept(input);
	}
}

