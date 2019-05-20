package learnjava.functionalinterfacesdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemoWithBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Book1","Book Desc1"));
		books.add(new Book("Book2","Book Desc2"));
		books.add(new Book("Book3","Book Desc3"));
		
		Function<Book,String> bookNameRetriever = (book) -> {return book.getBookName();};
		
		List<String> bookNames = new ArrayList<String>();
		for(Book book:books){
			bookNames.add(bookNameRetriever.apply(book));
		}
		System.out.println("Book names are:"+bookNames);
	}

}
