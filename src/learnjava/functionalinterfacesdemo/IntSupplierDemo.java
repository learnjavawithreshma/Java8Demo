package learnjava.functionalinterfacesdemo;

import java.util.Date;
import java.util.Random;
import java.util.function.IntSupplier;


public class IntSupplierDemo {

	public static void main(String[] args) {
		IntSupplier getRandom = () ->  new Random().nextInt(100);
		System.out.println("Random number 1 = "+getRandom.getAsInt());
		System.out.println("Random number 2 = "+getRandom.getAsInt());
	}

}
