package learnjava.functionalinterfacesdemo;

import java.util.Random;
import java.util.function.LongSupplier;

public class LongSupplierDemo {

	public static void main(String[] args) {
			LongSupplier getRandom = () ->  new Random().nextLong();
			System.out.println("Random number 1 = "+getRandom.getAsLong());
			System.out.println("Random number 2 = "+getRandom.getAsLong());

	}

}
