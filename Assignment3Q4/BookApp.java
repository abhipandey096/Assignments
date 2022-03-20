package Assignment3Q4;
import java.util.*;
import java.io.*;
public class BookApp {
	private String bookAppName="Harman lib";
	private List<Book>books=new LinkedList<Book>();
	public BookApp() {
		
		init();
	}
	public Book searchBook(int id) {
		boolean isFound=false;
		for(Book book:books) {
			if(book.getId()==id) {
				isFound=true;
				return book;
			}
		}
		if(!isFound)
			throw new BookNotFoundException();
		return null;
	}
	public void sellBook(String isbn, int noOfCopies) {
		
	}
	public void purchageBook(String isbn,int noOfCopies) {
		
	}

	private void init() {
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("book.txt")));
			String line=null;
			while ((line=br.readLine())!=null) {
				String tokens[]=line.split(":");
				Book tempBook = new Book(Integer.parseInt(tokens[0]),
						tokens[1],
						tokens[2],
						tokens[3],
						Double.parseDouble(tokens[4]));
				books.add(tempBook);
			}
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void printBookApp() {
		System.out.println("------bookAppName-------");
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
