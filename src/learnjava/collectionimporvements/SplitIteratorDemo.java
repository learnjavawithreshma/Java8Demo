package learnjava.collectionimporvements;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(5, 3, 21, 15, 9, 2, 12, 11);
		Spliterator<Integer> sitr1 = input.spliterator();
		
		
		sitr1.tryAdvance(num -> System.out.println(num));
		
		
		long estimatedSize = sitr1.estimateSize();
		System.out.println("EstimatedSize:"+estimatedSize);
		long exactSize = sitr1.getExactSizeIfKnown();
		System.out.println("exactSize:"+exactSize);
		int characteristic = sitr1.characteristics();
		System.out.println("characteristic:"+characteristic);
	}

}


//Spliterator<Integer> sitr2 = sitr1.trySplit();
//
//System.out.println("SplitIterator 1:");
//sitr1.forEachRemaining(num -> System.out.println(num));
//
//System.out.println("SplitIterator 2:");
//sitr2.forEachRemaining(num -> System.out.println(num));
