package learnjava.functionalinterfacesdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		
		UnaryOperator<List<Integer>> increaseBy5 = input -> {
														List<Integer> output = new ArrayList<Integer>();
														input.forEach(num -> output.add(num+5));
														return output;
													};
		List<Integer> output = increaseBy5.apply(list);
		output.forEach(num -> System.out.println(num));
	
	}

}

//System.out.println("Output with input 7 is "+increaseBy5.apply(7));

//List<Integer> output = new ArrayList<Integer>();
//input.forEach(num -> output.add(increaseBy5.apply(num)));
//output.forEach(num -> System.out.println(num));
