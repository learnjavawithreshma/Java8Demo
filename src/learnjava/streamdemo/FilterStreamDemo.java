package learnjava.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		Stream<Integer> stream = input.stream().filter(num -> num >= 9);
		stream.forEach(num -> System.out.println(num));

	}

}


//Stream<Integer> stream = list.stream().filter(num -> num >= 9);
//stream.forEach(num -> System.out.println(num));

//List<Integer> output = new ArrayList<Integer>();
//for(int num:input){
//	if(num > 9)
//		output.add(num);
//}
//output.forEach(num -> System.out.println(num));
