package learnjava.collectionimporvements;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresentDemo {

	public static void main(String[] args) {
		Map <Integer,String> students = new HashMap<Integer,String>();
		students.put(100, "Swati Shashtri");
		students.put(101, "Gina George");
		students.put(102, "Puja Khanna");
		
		
		students.compute(103, (key,value) -> value+",Pune");
		System.out.println(students.get(103));
		students.computeIfPresent(104, (key,value) -> value+",Bangalore");
		System.out.println(students.get(104));

	}

}
