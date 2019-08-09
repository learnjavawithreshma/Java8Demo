package learnjava.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class AllMatchClassDemo {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>(); 
		personList.add(new Person("Tom",25));
		personList.add(new Person("Jane",31));
		personList.add(new Person("Ram",15));
	
		
		boolean adultPresent = personList.stream().allMatch(person -> person.getAge() > 18);
		System.out.println("All adults present="+adultPresent);

	}

}
