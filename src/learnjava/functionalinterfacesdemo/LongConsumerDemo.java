package learnjava.functionalinterfacesdemo;

import java.util.function.LongConsumer;

public class LongConsumerDemo {

	public static void main(String args[]) {
		LongConsumer decrementBy5 = (num) -> System.out.println("Input:"+num+", Incremented Value:"+(num-5));
		decrementBy5.accept(12);
		decrementBy5.accept(23);
	}

}
