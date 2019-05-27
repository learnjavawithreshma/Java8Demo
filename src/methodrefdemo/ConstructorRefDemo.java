package methodrefdemo;

import java.util.function.Supplier;

public class ConstructorRefDemo {
	
		public static void main(String[] args) {
		PersonSupplier personSupplier = Person::new;
		Person person = personSupplier.createPerson("abc", 25);
		
	}

}
