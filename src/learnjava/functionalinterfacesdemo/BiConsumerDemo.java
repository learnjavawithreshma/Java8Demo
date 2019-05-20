package learnjava.functionalinterfacesdemo;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String args[]){
		BiConsumer<String,Integer> printConcatenatedValue = (input1,input2) -> System.out.println("Result of concatenating the inputs is "+(input1+input2));
		printConcatenatedValue.accept("Hello World",5);
	}
	
	//public static void main(String args[]){
//	BiConsumer<Integer,Integer> displaySum = (input1,input2) -> System.out.println("Sum of inputs is "+(input1+input2));
//	displaySum.accept(4,8);
//}

}

