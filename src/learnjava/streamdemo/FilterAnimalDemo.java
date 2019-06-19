package learnjava.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterAnimalDemo {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); 
		animals.add(new Animal("cow","herbivore"));
		animals.add(new Animal("lion","carnivore"));
		animals.add(new Animal("tiger","carnivore"));
		animals.add(new Animal("giraffe","herbivore"));
		animals.add(new Animal("zebra","herbivore"));
		
		Stream<Animal> herbivores = animals.stream().filter(animal -> animal.getType().equals("herbivore"));
		herbivores.forEach(animal -> System.out.println(animal.getName()));

	}


}
