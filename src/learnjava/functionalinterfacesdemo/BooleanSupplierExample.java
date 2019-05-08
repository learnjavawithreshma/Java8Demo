package learnjava.functionalinterfacesdemo;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class BooleanSupplierExample {

	public static void main(String[] args) {
		BooleanSupplier booleanSupplier = () ->  true;
		System.out.println("Boolean flag = "+booleanSupplier.getAsBoolean());
	}
}
