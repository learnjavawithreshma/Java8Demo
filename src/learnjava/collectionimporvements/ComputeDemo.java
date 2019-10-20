package learnjava.collectionimporvements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComputeDemo {

	public static void main(String[] args) {
		Map <Integer,String> students = new HashMap<Integer,String>();
		students.put(100, "Swati Shashtri");
		students.put(101, "Gina George");
		students.put(102, "Puja Khanna");
		
		students.compute(100, (key,value) -> value+",Pune");
		System.out.println(students.get(100));
		students.compute(101, (key,value) -> value+",Bangalore");
		System.out.println(students.get(101));
		
	}

}
