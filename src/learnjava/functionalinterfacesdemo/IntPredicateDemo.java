package learnjava.functionalinterfacesdemo;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
	public static void main(String args[]){
		IntPredicate greaterThan10 = (input) -> input > 10;
		System.out.println("4 is greater than 10 = "+greaterThan10.test(4));
		System.out.println("15 is greater than 10 = "+greaterThan10.test(15));
	}
}
