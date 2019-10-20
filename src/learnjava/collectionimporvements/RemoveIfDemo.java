package learnjava.collectionimporvements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfDemo {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(12);
		input.add(17);
		input.add(18);
		input.add(25);
		
		boolean anyElementRemoved = input.removeIf(num -> (num%2==0));
		if(anyElementRemoved){
			System.out.println("Elements were removed");
			input.forEach(num -> System.out.println(num));
		}
		else
			System.out.println("Elements were not removed");

	}

}
