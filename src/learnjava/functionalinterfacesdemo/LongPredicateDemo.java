package learnjava.functionalinterfacesdemo;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class LongPredicateDemo {

	public static void main(String[] args) {
			LongPredicate greaterThan10 = (input) -> input > 10;
			System.out.println("4 is greater than 10 = "+greaterThan10.test(new Long(4)));
			System.out.println("15 is greater than 10 = "+greaterThan10.test(new Long(15)));
	}

}
