package Assignment3Q4;

public class BookAppMain {
	public static void main(String[] args) {
		BookApp  app=new BookApp();
		app.printBookApp();
		Book book=app.searchBook(102);
		System.out.println(book);
	}

}
