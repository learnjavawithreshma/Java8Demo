package learnjava.functionalinterfacesdemo;

import java.util.Random;
import java.util.function.DoubleSupplier;


public class DoubleSupplierDemo {

	public static void main(String[] args) {
		DoubleSupplier getRandom = () ->  new Random().nextDouble();
		System.out.println("Random number 1 = "+getRandom.getAsDouble());
		System.out.println("Random number 2 = "+getRandom.getAsDouble());

	}

}
