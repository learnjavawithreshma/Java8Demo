package learnjava.functionalinterfacesdemo;

import java.util.function.DoublePredicate;


public class DoublePredicateDemo {

	public static void main(String args[]){
		DoublePredicate greaterThan1 = (input) -> input > 1;
		System.out.println("0.75 is greater than 0 = "+greaterThan1.test(0.75));
		System.out.println("1.12 is greater than 0 = "+greaterThan1.test(1.25));
	}

}
