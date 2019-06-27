package learnjava.functionalinterfacesdemo;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo {

	public static void main(String args[]) {
		DoubleConsumer squareGenerator = (num) -> System.out.println(num*num);
		double input = 5.0;
		squareGenerator.accept(input);
	}

}
