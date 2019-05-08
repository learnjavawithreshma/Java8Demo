package learnjava.functionalinterfacesdemo;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Date> dateGenerator = () -> new Date();
		System.out.println("Date is "+dateGenerator.get());
		
//		Supplier<Integer> getRandom = () ->  new Random().nextInt(100);
//		System.out.println("Random number 1 = "+getRandom.get());
//		System.out.println("Random number 2 = "+getRandom.get());
//		
//		//with custom class
//		Supplier<Book> createBook = () -> new Book("Test","Test");
//		System.out.println("Book is "+createBook.get());
		
	}

}
