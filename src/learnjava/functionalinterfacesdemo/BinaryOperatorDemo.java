package learnjava.functionalinterfacesdemo;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String args[]) {
		BinaryOperator<Integer> additionCalculator = (a, b) -> a +b;
		int input1 = 6;
		int input2 = 5;
		System.out.println("Result of adding " + input1 + " and " + input2 + " is " + additionCalculator.apply(input1, input2));
	}

}
