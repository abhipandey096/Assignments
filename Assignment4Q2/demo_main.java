package Assignment4Q2;

public class demo_main {
	public static void main(String[] args) {
		BookCollection bc=new BookCollection("Abhishek Pandey");
		Book b=new Book(109, "power of mind", "bar");
		System.out.println("Book already exist :"+bc.hasBook(b));
		bc.toString();
		System.out.println("\n");
		
		bc.sort1();
		System.out.println("\n");
		bc.sort2();
	}

}
