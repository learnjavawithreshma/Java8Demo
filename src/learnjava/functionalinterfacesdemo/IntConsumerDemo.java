package learnjava.functionalinterfacesdemo;

import java.util.function.IntConsumer;

public class IntConsumerDemo {

	public static void main(String args[]) {
		IntConsumer incrementby5 = (num) -> System.out.println("Input:"+num+", Incremented Value:"+(num+5));
		incrementby5.accept(12);
		incrementby5.accept(23);
	}

}
