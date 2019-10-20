package learnjava.collectionimporvements;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfStringDemo {

	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		input.add("March");
		input.add("January");
		input.add("September");
		input.add("December");
		
		boolean elementsRemoved = input.removeIf(str -> str.endsWith("day"));
		if(elementsRemoved){
			System.out.println("Elements were removed");
			input.forEach(str -> System.out.println(str));
		}
		else
			System.out.println("Elements were not removed");
	}

}
