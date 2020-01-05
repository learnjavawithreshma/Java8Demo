package learnjava.functionalinterfacesdemo;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;

public class IntFunctionDemo {

	public static void main(String[] args) {
		IntFunction<Double> integerRetriever = input -> new Double(input);
		System.out.println("Double value " + integerRetriever.apply(5));
		
		int[] inputArray = new int[] {2,4,7};
		
	}

}
