package learnjava.collectionimporvements;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 11, 15, 9, 2, 5, 11);
		Iterator<Integer> itr = input.iterator();
		itr.forEachRemaining(num -> System.out.println(num));
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}

//itr.forEachRemaining(num -> System.out.println(num));