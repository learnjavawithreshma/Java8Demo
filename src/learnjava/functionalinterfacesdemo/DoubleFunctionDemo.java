package learnjava.functionalinterfacesdemo;

import java.util.function.DoubleFunction;
import java.util.function.Function;

public class DoubleFunctionDemo {

	public static void main(String[] args) {
		DoubleFunction<Integer> integerRetriever = input -> new Double(input).intValue();
		Double input = 4.8;
		System.out.println("IntegerValue "+integerRetriever.apply(input) );
		}

}
