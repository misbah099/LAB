/*Problem 3.
Program to create library book Management system
to store and display book details in library where you can
create two classes one is main another one is library, where you can
create two methods as addBook,dispanseBook and
bookId,bookName,bookAuthor as instance variables */
package lab;
public class Library {
private int bookId;
private String bookName,bookAuthor;
void addBook(int id,String bname,String bauthor) {
	this.bookId=id;
	this.bookName=bname;
	this.bookAuthor=bauthor;
}
void dispenseBook(String name) {
	if(name==bookName) {
		System.out.println("book id="+this.bookId+"\n Book name="+this.bookName+"\n Book author="+this.bookAuthor);
	}
	else {
		System.out.println("Book not Found");
	}
}
}
