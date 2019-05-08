package learnjava.functionalinterfacesdemo;

public class Book {
	
	private String bookName;
	private String bookDesc;
	
	public Book(String bookName,String bookDesc){
		this.bookName = bookName;
		this.bookDesc = bookDesc;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	
	public String toString(){
		return bookName+":"+bookDesc;
	}

}
