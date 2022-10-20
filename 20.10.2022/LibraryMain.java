package lab;

public class LibraryMain {

	public static void main(String[] args) {
Library l1=new Library();
Library l2=new Library();
l1.addBook(111, "physics", "sl arora");
l1.dispenseBook("physics");
l2.addBook(2121, "Chemistry", "sl arora");
l2.dispenseBook("physics");
	}

}
