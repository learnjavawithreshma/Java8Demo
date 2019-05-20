package learnjava.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchClassDemo {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); 
		animals.add(new Animal("cow","herbivore"));
		animals.add(new Animal("lion","carnivore"));
		animals.add(new Animal("tiger","carnivore"));
		animals.add(new Animal("giraffe","herbivore"));
		animals.add(new Animal("zebra","herbivore"));
		
		boolean herbivorePresent = animals.stream().anyMatch(animal -> animal.getType().equals("herbivore"));
		System.out.println("Herbivore present="+herbivorePresent);

	}

}
